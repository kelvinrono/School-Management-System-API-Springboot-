package com.school.management.system.service;

import com.school.management.system.entity.Student;
import com.school.management.system.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {

      List<Student> getAllstudents();

      Student createStudent(Student student);

     Student getOneStudent(int id);

     void deleteStudent(int id);

     Student updateStudent(Student student);
}
