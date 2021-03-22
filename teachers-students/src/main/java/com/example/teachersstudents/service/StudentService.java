package com.example.teachersstudents.service;

import com.example.teachersstudents.model.User;
import com.example.teachersstudents.model.Student;
import com.example.teachersstudents.repository.StudentRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository repository;

    public List<Student> getStudentsByClazz(String clazz) {
        return repository.getAllByClazz(clazz);
    }

    public Student getStudentForParent(User user) {
        return repository.getStudentByIdParent(user.getId())
                .orElse(new Student(user.getId(), user.getClazz()));
    }

    public void save(Student student) {
        repository.save(student);
    }

    public void delete(User user) {
        var student = repository.getStudentByIdParent(user.getId());
        student.ifPresent(repository::delete);
    }

}
