 package com.nisum.SpringbootHibernateManyToManyAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nisum.SpringbootHibernateManyToManyAnnotation.entity.Post;
import com.nisum.SpringbootHibernateManyToManyAnnotation.entity.Tag;
import com.nisum.SpringbootHibernateManyToManyAnnotation.repository.PostRepository;

@SpringBootApplication
public class SpringbootHibernateManyToManyAnnotationApplication implements CommandLineRunner{
@Autowired
private PostRepository postRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootHibernateManyToManyAnnotationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Post post =new Post("Nisum","About Nisum");
		Post post1 =new Post("Employee","About Employee");
		Tag t=new Tag("Hibernate");
		Tag t1=new Tag("spring boot");
		Tag t2=new Tag("spring jpa");
		post.getTags().add(t);
		post.getTags().add(t1);
		post.getTags().add(t2);
		
		t.getPosts().add(post);
		t.getPosts().add(post1);
		t1.getPosts().add(post);
		this.postRepository.save(post);
		this.postRepository.save(post1);
		
		
		
	}

}
