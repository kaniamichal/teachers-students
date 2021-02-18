package com.example.teachersstudents.exception;

public class StudentNotFoundException extends RuntimeException {

    public StudentNotFoundException(){
        super("Student not found");
    }
}
