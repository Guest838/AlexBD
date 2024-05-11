package com.example.AlBD;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.AlBD.repository")
@ComponentScan(basePackages =  {"com.example.AlBD.controller", "com.example.AlBD.service"})
@EntityScan("com.example.AlBD.dto")
public class AlBdApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlBdApplication.class, args);
	}

}
