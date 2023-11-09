package com.example.spring_mvc.service.implement;

import com.example.spring_mvc.entity.Student;
import com.example.spring_mvc.repository.StudentRepository;
import com.example.spring_mvc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void saveStudent(Student student) {
        try {
            studentRepository.save(student);
        }catch (Exception ex){
            System.out.print(ex.getMessage());
        }
    }

    @Override
    public void deleteStudent(Long id) {
        try{
            studentRepository.deleteById(id);
        }catch (Exception ex){
            System.out.print(ex.getMessage());
        }
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));
    }
}
