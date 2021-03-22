package com.example.teachersstudents.repository;

import com.example.teachersstudents.model.StudentTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentTaskRepository extends JpaRepository<StudentTask, Long> {

    List<StudentTask> findAllByIdStudent(Long idStudent);

}