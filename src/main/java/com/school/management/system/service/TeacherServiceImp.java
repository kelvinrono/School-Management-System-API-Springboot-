package com.school.management.system.service;

import com.school.management.system.entity.Teacher;
import com.school.management.system.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service

public class TeacherServiceImp implements TeachersService{

    @Autowired
    private TeacherRepository teacherRepository;
    @Override
    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher createTeacher(Teacher teacher) {
       return teacherRepository.save(teacher);

    }

    @Override
    public Teacher getOneTeacher(int id) {

        Optional<Teacher> teacher = teacherRepository.findById(id);

        if(teacher.isPresent()){
            return teacher.get();
        }
         throw new RuntimeException( "Teacher with the id" +id + "cannot be found");
    }

    @Override
    public void deleteTeacher(int id) {
        teacherRepository.deleteById(id);
    }

    @Override
    public Teacher updateTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);

    }
}
