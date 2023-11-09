package com.example.spring_mvc.controller;

import com.example.spring_mvc.entity.Customer;
import com.example.spring_mvc.entity.Student;
import com.example.spring_mvc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/formCreateStudent")
    public String getFormCreate(ModelMap modelMap){
        String view = "createOrUpdateStudentForm";
        try {
            Student student= new Student();
            modelMap.addAttribute("student", student);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return view;

    }

    @GetMapping("/updateStudent/{id}")
    public String getFormUpdate(@PathVariable Long id, ModelMap modelMap) {
        String view = "createOrUpdateStudentForm";
        try {
            Student student = studentService.getStudentById(id);
            modelMap.addAttribute("student", student);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return view;
    }

    @PostMapping("createOrUpdateStudent")
    public String saveCreateOrUpdate(Student student){
        String view = "redirect:/student/getAllStudent";
        try {
            studentService.saveStudent(student);
        }catch (Exception ex){
            System.out.print(ex.getMessage());
        }
        return view;
    }

    @GetMapping("/getAllStudent")
    public String getAll(ModelMap modelMap){
        String view = "listStudent";
        try {
            List<Student> students = studentService.getAllStudent();
            modelMap.addAttribute("students", students);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return view;
    }
    @GetMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable Long id){
        String view = "redirect:/student/getAllStudent";
        try {
            studentService.deleteStudent(id);
        }catch (Exception ex){
            System.out.print(ex.getMessage());
        }
        return view;
    }
}
