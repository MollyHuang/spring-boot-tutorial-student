package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam.jamal@deltaww.com",
                    LocalDate.of(2000, SEPTEMBER, 5)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@deltaww.com",
                    LocalDate.of(2004, FEBRUARY, 18)
            );

            Student molly = new Student(
                    "Molly",
                    "molly.h@deltaww.com",
                    LocalDate.of(1990, AUGUST, 1)
            );

            repository.saveAll(
                    List.of(mariam, alex, molly)
            );
        };
    }

}
