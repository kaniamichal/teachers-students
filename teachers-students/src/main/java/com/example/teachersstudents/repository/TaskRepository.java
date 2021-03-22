package com.example.teachersstudents.repository;
import com.example.teachersstudents.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findAllByIdTeacher(Long idTeacher);
}