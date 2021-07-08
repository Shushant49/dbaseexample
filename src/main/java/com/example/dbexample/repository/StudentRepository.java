package com.example.dbexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.dbexample.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
