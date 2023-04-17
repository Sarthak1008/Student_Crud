package com.example.student.student.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.student.student.bean.Student;
public interface StudentRepository extends JpaRepository<Student,Integer>{
    
}
