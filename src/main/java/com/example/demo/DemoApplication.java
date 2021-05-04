package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.GetMapping;

//import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


//	@GetMapping
//	public List<String> hello() {
//		return List.of("Hello", "World");
//	}

//	@GetMapping
//	public String hello() {
//		return "Hello World";
//	}

}
