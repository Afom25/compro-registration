package com.miu.registration.controller;


import com.miu.registration.Service.StudentService;
import com.miu.registration.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired

    private StudentService studentService;
}
