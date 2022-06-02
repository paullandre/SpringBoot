package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig
{
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository)
    {
        return args -> {
            Student paul_francisco = new Student(
                    "Paul Francisco",
                    "PaulAndre.Francisco@fsoft.com.vn",
                    LocalDate.of(1982, APRIL, 8)
            );

            Student james_bond = new Student(
                    "james_bond",
                    "PaulAndre.Francisco@fsoft.com.vn",
                    LocalDate.of(1960, APRIL, 1)
            );

            repository.saveAll(
                List.of(paul_francisco, james_bond )
            );
        };
    }
}