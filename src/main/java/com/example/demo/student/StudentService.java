package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1,
                        45,
                        LocalDate.of(1980, 12, 5),
                        "jean",
                        "jean.dupont@gmail.com"
                )
        );
    }
}
