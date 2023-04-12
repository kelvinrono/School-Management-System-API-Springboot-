package com.school.management.system.service;

import com.school.management.system.entity.Student;
import com.school.management.system.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImp implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllstudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getOneStudent(int id) {
        Optional<Student> student = studentRepository.findById(id);
        if (student.isPresent()) {
            return student.get();
        }
        throw new RuntimeException("Student is not found with id: "+id);

    }

    @Override
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }

    //@Modifying
    //@Query("update Customer u set u.phone = :phone where u.id = :id")
    //void updatePhone(@Param(value = "id") long id, @Param(value = "phone") String phone);
    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);

    }


}
