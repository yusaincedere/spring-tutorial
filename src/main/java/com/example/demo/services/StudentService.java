package com.example.demo.services;

import com.example.demo.models.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "yusa",
                        "yusa@gmail.com",
                        24,
                        LocalDate.of(1998, Month.FEBRUARY,12)

                )
        );
    }
}
