package com.school.management.system.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student")

public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int student_id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;


    @Column(name = "admission")
    private int adm;

    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            optional = false
    )
    @JoinColumn(
            name = "guardian_id",
            referencedColumnName = "guardian_id"

    )
    private Guardian guardian;

    @ManyToOne
    @JoinColumn(
            name = "teacher_id",
            referencedColumnName = "teacher_id"
    )
    private Teacher teacher;
//
//    @ManyToMany
//    @JoinTable(
//            name = "student_subject_mapper",
//            joinColumns = @JoinColumn(
//                    name = "student_id",
//                    referencedColumnName = "student_id"
//
//            ),
//            inverseJoinColumns = @JoinColumn(
//                    name = "subject_id",
//                    referencedColumnName = "subject_id"
//            )
//
//    )
//    private List<Subject> subject;


}
