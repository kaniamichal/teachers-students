package com.example.teachersstudents.service;
import com.example.teachersstudents.model.Student;
import com.example.teachersstudents.model.StudentTask;
import com.example.teachersstudents.model.Task;
import com.example.teachersstudents.repository.StudentTaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentTaskService {

    private final StudentTaskRepository repository;

    public void assignTaskToStudent(List<Student> students, Task task) {
        List<StudentTask> studentTasks = new ArrayList<>();
        students.forEach(student ->
                studentTasks.add(
                        new StudentTask(task.getId(), student.getId(), task.getDescription(), task.getDueDate())
                )
        );
        repository.saveAll(studentTasks);
    }

    public List<StudentTask> getTasksForStudent(Long idStudent) {
        return repository.findAllByIdStudent(idStudent);
    }

    public StudentTask getTask(Long id) {
        return repository.findById(id).get();
    }

    public void updateGrade(StudentTask studentTask) {
        repository.save(studentTask);
    }
}