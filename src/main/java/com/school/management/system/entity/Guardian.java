package com.school.management.system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Embeddable
public class Guardian {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int guardian_id;
    private String guardian_name;
    private int guardian_contact;

//    @OneToOne(
//            mappedBy = "guardian"
//    )
//    private Student student;
}
