package com.school.management.system.service;

import com.school.management.system.entity.Teacher;

import java.util.List;

public interface TeachersService {

    List<Teacher> getAllTeachers();

    Teacher createTeacher(Teacher teacher);

    Teacher getOneTeacher(int id);

    void deleteTeacher(int teacher);

    Teacher updateTeacher(Teacher teacher);
}
