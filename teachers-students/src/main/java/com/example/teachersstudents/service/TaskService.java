package com.example.teachersstudents.service;
import com.example.teachersstudents.model.Student;
import com.example.teachersstudents.model.Task;
import com.example.teachersstudents.model.User;
import com.example.teachersstudents.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskService {

    private final TaskRepository repository;
    private final StudentTaskService studentTaskService;

    public void createTask(User teacher, List<Student> students, Task task) {
        task.setIdTeacher(teacher.getId());
        var createdTask= repository.save(task);
        studentTaskService.assignTaskToStudent(students, createdTask);
    }

    public List<Task> findAllByIdTeacher(Long idTeacher) {
        return repository.findAllByIdTeacher(idTeacher);
    }

}