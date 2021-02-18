package com.example.teachersstudents.service;

import com.example.teachersstudents.exception.AccountNotFoundException;
import com.example.teachersstudents.model.Student;
import com.example.teachersstudents.exception.StudentNotFoundException;
import com.example.teachersstudents.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {

    private final StudentRepository repository;

    public Student getStudent(Student id) {
        return repository.findById(id).orElseThrow(StudentNotFoundException::new);
    }

    public List<Student> findAll(){
        return repository.findAll();
    }

    public Student createStudent(Student student){
        repository.save(student);
        return student;
    }

    public Student updateStudent(Student student){
        repository.save(student);
        return student;
    }


    public void deleteStudent(Long id){
        repository.deleteById(id);
    }

   public Long getStudentById(Long id) throws StudentNotFoundException {
        Long studentId = repository.findById(id).get().getId();
        return studentId;
    }


}
