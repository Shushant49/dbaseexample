package com.example.dbexample.service;

import com.example.dbexample.model.Teacher;

import java.util.List;

public interface TeacherService {

    List<Teacher> getTeacherList();
    Teacher saveTeacher(Teacher teacher);
}
