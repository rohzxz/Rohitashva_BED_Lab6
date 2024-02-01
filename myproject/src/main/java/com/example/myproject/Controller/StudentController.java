package com.example.myproject.Controller;

import com.example.myproject.Service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// StudentController.java
@Controller
public class StudentController {
    @Autowired
    private StudentServiceImpl studentService;

    // Implement controller methods for handling CRUD operations
}
