package com.example.student.student.controller;
import java.util.*;
import org.springframework.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.example.student.student.service.StudentService;
import com.example.student.student.bean.*;
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/")
    public String hello(){
        // System.out.println("Hello");
        return "Hello";
    }

    @GetMapping("/listStudent")
    public List<Student> listAllStudent()
    {
        List<Student> listOfStudents=studentService.getAllStudents();
        return listOfStudents;
    }
    @PostMapping("/addStudent")
    public Student registerStudent(@RequestBody Student student)
    {
        Student newStudent=studentService.addNewStudent(student);
        return newStudent;
    }
    @PutMapping("/updateStudent")
    public Student updateStudent(@RequestBody Student student)
    {
        return studentService.updateStudent(student);
    }
    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable int id)
    {
        return studentService.deleteStudent(id);
    }
}
