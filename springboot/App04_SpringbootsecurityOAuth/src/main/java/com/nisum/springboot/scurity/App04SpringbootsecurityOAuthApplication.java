package com.nisum.springboot.scurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
public class App04SpringbootsecurityOAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(App04SpringbootsecurityOAuthApplication.class, args);
	}

}
