package com.example.spring_mvc.service;

import com.example.spring_mvc.entity.Student;

import java.util.List;

public interface StudentService {
    void saveStudent(Student student);
    void deleteStudent(Long id);
    List<Student> getAllStudent();
    Student getStudentById(Long id);

}
