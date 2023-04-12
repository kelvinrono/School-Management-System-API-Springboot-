package com.school.management.system.service;

import com.school.management.system.entity.Subject;

import java.util.List;

public interface SubjectService {
    List<Subject> getAllSubjects();

    Subject createSubject(Subject subject);

    Subject getOneSubject(int id);

    void deleteSubject(int subject);

    Subject updateSubject(Subject subject);
}
