package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.cglib.core.Local;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {

            Student jean = new Student(
                    "Jean",
                    "jean.mail@gmail.com",
                    LocalDate.of(1980, Month.JANUARY, 8)
            );

            Student alex = new Student(
                    "Alex",
                    "alex.mail@gmail.com",
                    LocalDate.of(1990, Month.MARCH, 28)
            );

            studentRepository.saveAll(
                    List.of(jean, alex)
            );
        };
    }
}
