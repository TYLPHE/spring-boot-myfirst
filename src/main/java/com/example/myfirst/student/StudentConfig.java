package com.example.myfirst.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student tyler = new Student(
                    "Tyler",
                    "test@test.com",
                    LocalDate.of(2000, Month.APRIL, 5)
            );
            Student alex = new Student(
                    "Alex",
                    "Alex@test.com",
                    LocalDate.of(2004, Month.APRIL, 5)
            );
            Student jack = new Student(
                    "Jack",
                    "Jack@test.com",
                    LocalDate.of(1999, Month.APRIL, 5)
            );

            repository.saveAll(List.of(tyler, alex, jack));
        };
    }
}
