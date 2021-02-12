package com.nisum.onetoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import com.nisum.onetoone.entity.User1;
import com.nisum.onetoone.entity.UserProfile;
import com.nisum.onetoone.repository.UserProfileRepository;
import com.nisum.onetoone.repository.UserRepository;

@SpringBootApplication
public class OneToOneApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OneToOneApplication.class, args);
	}
	
@Autowired
private UserRepository userRepository;
@Autowired
private UserProfileRepository userProfileRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User1 user=new User1();
		user.setName("Ranjani");
		UserProfile userprofile=new UserProfile();
		userprofile.setAddress("Hyderabad");
		
		user.setUserprofile(userprofile);
		userprofile.setUser(user);
		
		userRepository.save(user);
	}

}
