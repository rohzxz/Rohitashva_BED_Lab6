package com.example.myproject.dao;
import java.util.List;
import com.example.myproject.model.Student;

public interface StudentDAO {
    void addStudent(Student student);

    void updateStudent(Student student);

    void deleteStudent(Long studentId);

    List<Student> getAllStudents();
}
