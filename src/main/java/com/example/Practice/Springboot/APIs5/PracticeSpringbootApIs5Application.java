package com.example.Practice.Springboot.APIs5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeSpringbootApIs5Application {

	public static void main(String[] args) {
		SpringApplication.run(PracticeSpringbootApIs5Application.class, args);

		UpdateDemo demo = new UpdateDemo();
		demo.updateStudent();
	}

}
