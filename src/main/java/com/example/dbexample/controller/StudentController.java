package com.example.dbexample.controller;

import com.example.dbexample.model.Student;
import com.example.dbexample.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student")
    public List<Student> studentList() {

        return studentService.getStudentList();
    }
}
