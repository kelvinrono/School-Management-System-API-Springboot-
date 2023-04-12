package com.school.management.system.controller;

import com.school.management.system.entity.Student;
import com.school.management.system.service.StudentService;
import com.school.management.system.service.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    private StudentServiceImp studentServiceImp;
    @GetMapping("/getStudents")
    public List<Student> getallStudents(){
        return studentService.getAllstudents();
    }

    @PostMapping("/createStudent")
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @GetMapping("/getSingleStudent/{id}")
    public Student getSingleStudent(@PathVariable("id") int id){
        return studentService.getOneStudent(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable("id") int id) {
    studentService.deleteStudent(id);
    }

        @PutMapping("update/{id}")
    public Student updateStudent(@PathVariable("id") int id,@RequestBody Student student){
    return studentService.updateStudent(student);
    }
}
