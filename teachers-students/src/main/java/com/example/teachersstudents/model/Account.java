package com.example.teachersstudents.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.dom4j.tree.AbstractEntity;
import javax.persistence.*;

@Entity
@Table(name = "accounts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;
    @Column(nullable = false, unique = true, length = 50)
    private String login;
    @Column(nullable = false, length = 64)
    private String password;
    @Column(nullable = false, length = 64)
    private String confirmPassword;
    @Column(nullable = false, length = 2)
    private String clazz;
    @Column(length = 5)
    private boolean teacher;

}
