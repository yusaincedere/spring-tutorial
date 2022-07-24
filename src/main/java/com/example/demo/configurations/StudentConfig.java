package com.example.demo.configurations;

import com.example.demo.models.Student;
import com.example.demo.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student yusa = new Student(
                    "Yuşa",
                    "yusa@gmail.com",
                    LocalDate.of(1998, Month.FEBRUARY,12)
            );
            Student ali = new Student(
                    "Ali",
                    "ali@gmail.com",
                    LocalDate.of(1999, Month.DECEMBER,5)
            );
            studentRepository.saveAll(List.of(yusa,ali));
        };
    }
}
