package com.example.dbexample.service;

import com.example.dbexample.model.Student;
import com.example.dbexample.model.Teacher;

import java.util.List;

public interface StudentService {

    List<Student> getStudentList();
    Student saveStudent(Student student);
}
