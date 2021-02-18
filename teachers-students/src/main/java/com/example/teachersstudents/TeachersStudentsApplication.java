package com.example.teachersstudents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class TeachersStudentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeachersStudentsApplication.class, args);
	}

}
