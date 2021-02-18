package com.example.teachersstudents.model;

import lombok.Data;

@Data
public class StudentDTO {
    private static Long id;
    private String clazz;

    public static Long getId() {
        return id;
    }
}
