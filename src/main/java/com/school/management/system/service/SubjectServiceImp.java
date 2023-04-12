package com.school.management.system.service;

import com.school.management.system.entity.Subject;
import com.school.management.system.repository.SubjectRepository;
import com.school.management.system.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectServiceImp implements SubjectService{
    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    @Override
    public Subject createSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public Subject getOneSubject(int id) {
        Optional<Subject> subject = subjectRepository.findById(id);
        if (subject.isPresent()) {
            return subject.get();
        }
        throw new RuntimeException("Subject is not found with id: "+id);

    }

    @Override
    public void deleteSubject(int id) {
        subjectRepository.deleteById(id);
    }

    @Override
    public Subject updateSubject(Subject subject) {
        return subjectRepository.save(subject);
    }
}
