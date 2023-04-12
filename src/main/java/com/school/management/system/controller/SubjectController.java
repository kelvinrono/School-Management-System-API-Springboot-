package com.school.management.system.controller;

import com.school.management.system.entity.Subject;
import com.school.management.system.entity.Subject;
import com.school.management.system.service.SubjectService;
import com.school.management.system.service.SubjectServiceImp;
import com.school.management.system.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/subject")
public class SubjectController {


    @Autowired
    private SubjectService subjectService;

    @GetMapping("/getSubjects")
    public List<Subject> getallSubjects(){
        return subjectService.getAllSubjects();
    }

    @PostMapping("/createSubject")
    public Subject createSubject(@RequestBody Subject subject){

        return subjectService.createSubject(subject);
    }

    @GetMapping("/getSingleSubject/{id}")
    public Subject getSingleSubject(@PathVariable("id") int id){
        return subjectService.getOneSubject(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSubject(@PathVariable("id") int id) {
        subjectService.deleteSubject(id);
    }

    @PutMapping("update/{id}")
    public Subject updateSubject(@PathVariable("id") int id,@RequestBody Subject subject){
        return subjectService.updateSubject(subject);
    }
}
