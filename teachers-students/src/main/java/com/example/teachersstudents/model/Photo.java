package com.example.teachersstudents.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.dom4j.tree.AbstractEntity;

import javax.persistence.*;
import javax.swing.*;
import java.awt.*;
import java.io.File;

@Entity
@Data
@Table(name = "photos")
@AllArgsConstructor
@NoArgsConstructor
public class Photo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    @Column(name = "id")
    private Long id;
    @Column(name = "id_student")
    private Long id_student;
    @Column(name = "photo")
    private String photo;
}
