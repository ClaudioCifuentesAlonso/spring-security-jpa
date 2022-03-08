package com.claudio.security.demo;

import com.claudio.security.demo.model.User;
import com.claudio.security.demo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoSpringSecurityJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringSecurityJpaApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository){
		return args -> {
			User user = new User();
			user.setUsername("ClaudioAlonso10");
			user.setPassword("password");
			user.setActive(true);
			user.setRoles("ROLE_USER,ROLE_ADMIN");
			userRepository.save(user);
		};
	}
}
