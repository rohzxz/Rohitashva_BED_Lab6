package com.example.myproject.Service;

import com.example.myproject.model.Student;

import java.util.List;


public interface StudentService {
    void addStudent(Student student);

    void updateStudent(Student student);

    void deleteStudent(Long studentId);

    List<Student> getAllStudents();
}

