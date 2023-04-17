package com.example.student.student.service;
import java.util.*;
import org.springframework.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.student.bean.Student;
import com.example.student.student.repository.StudentRepository;

import jakarta.*;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    //GET METHOD
    public List<Student> getAllStudents()
    {
        return studentRepository.findAll();
    }
    //POST METHOD
    public Student addNewStudent(Student student)
    {
        return studentRepository.save(student);
    }
    //delete method
    public String deleteStudent(int id)
    {
        studentRepository.deleteById(id);
        return "Student removed "+id;
    }
    //update method
    public Student updateStudent(Student student)
    {
        Student exiStudent=studentRepository.findById( (int) student.getroll_no()).orElse(null);
        exiStudent.setName(student.getName());
        exiStudent.setSchool(student.getSchool());
        return studentRepository.save(exiStudent);
    }
}
