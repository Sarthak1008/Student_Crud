package com.example.student.student.bean;
import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {
    @Id
    private long roll_no;
    private String name;
    private String school;
    public Student()
    {}
    public Student(long roll_no,String name,String school)
    {
        this.roll_no=roll_no;
        this.name=name;
        this.school=school;
    }
    public long getroll_no() {
        return roll_no;
    }
    public void setroll_no(long roll_no) {
        this.roll_no = roll_no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }
    
}
