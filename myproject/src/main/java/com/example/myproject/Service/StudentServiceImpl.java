package com.example.myproject.Service;

// StudentServiceImpl.java
// com.college.service.StudentServiceImpl.java



import java.util.List;

import com.example.myproject.dao.StudentDAO;
import com.example.myproject.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDAO studentDAO;


    public void addStudent(Student student) {
        studentDAO.addStudent(student);
    }

    @Override
    public void updateStudent(Student student) {
        studentDAO.updateStudent(student);
    }

    @Override
    public void deleteStudent(Long studentId) {
        studentDAO.deleteStudent(studentId);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }
}
