package com.example.teachersstudents.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "students")
@Data
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;
    private Long idParent;
    private String firstName;
    private String lastName;
    private String clazz;

    public Student(Long idParent, String clazz) {
        this.idParent = idParent;
        this.clazz = clazz;
    }
}
