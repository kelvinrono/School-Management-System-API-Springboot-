package com.school.management.system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "subject")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int subject_id;
    private String title;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "teacher_id",
            referencedColumnName = "teacher_id"
    )

    private Teacher teacher;

//    @ManyToOne()
//    @JoinColumn(
//            name = "student_id",
//            referencedColumnName = "student_id"
//    )
//    private Student student;

    @ManyToMany
    @JoinTable(
            name = "student_subject_mapper",
            joinColumns = @JoinColumn(
                    name = "subject_id",
                    referencedColumnName = "subject_id"

            ),
            inverseJoinColumns = @JoinColumn(
                    name = "student_id",
                    referencedColumnName = "student_id"
            )

    )
    private List<Student> students;
    public void addStudents(Student student) {
        if (students == null) students = new ArrayList<>();
        students.add(student);
    }

}
