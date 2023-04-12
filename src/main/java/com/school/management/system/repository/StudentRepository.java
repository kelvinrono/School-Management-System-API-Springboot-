package com.school.management.system.repository;

import com.school.management.system.entity.Student;
import com.school.management.system.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
