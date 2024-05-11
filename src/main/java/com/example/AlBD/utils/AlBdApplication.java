package com.example.AlBD.utils;

import com.example.AlBD.controller.DishController;
import com.example.AlBD.controller.SeasonController;
import com.example.AlBD.repository.DishRepository;
import com.example.AlBD.repository.SeasonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.AlBD.repository")
@ComponentScan(basePackages =  "com.example.AlBD.controller")
@EntityScan("com.example.AlBD.")
public class AlBdApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlBdApplication.class, args);
	}

}
