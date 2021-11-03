package com.Grupo4.AppTurimo;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppTurismoApplication {

	public static void main(String[] args) {
		
		SpringApplication app = new SpringApplication(AppTurismoApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8083"));
		app.run(args);
		//SpringApplication.run(AppTurismoApplication.class, args);
	}

}
