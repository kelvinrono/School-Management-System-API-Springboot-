package com.school.management.system.controller;

import com.school.management.system.entity.Teacher;
import com.school.management.system.service.TeachersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("teacher")
public class TeacherController {

    @Autowired
    private TeachersService teachersService;

    @GetMapping("/getAllTeachers")
    public List<Teacher> getAllTeacher(){
        return teachersService.getAllTeachers();
    }

    @PostMapping("/createTeacher")
    public Teacher createTeacher(@RequestBody Teacher teacher){
        return teachersService.createTeacher(teacher);
    }

    @GetMapping("/getSingleTeacher/{id}")
    public Teacher getSingleTeacher(@PathVariable("id") int id){
        return teachersService.getOneTeacher(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTeacher(@PathVariable("id") int id){
        teachersService.deleteTeacher(id);
    }

    @PutMapping("update/{id}")
    public Teacher updateTeacher(@RequestBody Teacher teacher, @PathVariable("id") int id){
        return teachersService.updateTeacher(teacher);

    }
}
