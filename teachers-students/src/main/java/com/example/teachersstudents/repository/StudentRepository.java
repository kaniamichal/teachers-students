package com.example.teachersstudents.repository;

import com.example.teachersstudents.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Long getStudentById(Long id);
    Optional<Student> findById(Student id);
}

