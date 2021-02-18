package com.example.teachersstudents.restController;

import com.example.teachersstudents.model.AccountDTO;
import com.example.teachersstudents.model.Photo;
import com.example.teachersstudents.model.Student;
import com.example.teachersstudents.model.StudentDTO;
import com.example.teachersstudents.service.AccountService;
import com.example.teachersstudents.service.PhotoService;
import com.example.teachersstudents.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;


    @GetMapping("all")
    public List<Student> findAll() {
        return studentService.findAll();
    }

    @PostMapping("addStudent")
    public String addStudent(@ModelAttribute Student student, Model model) {
        studentService.createStudent(student);
        model.addAttribute("id", student.getId());
        model.addAttribute("clazz", student.getClazz());
        model.addAttribute("first_name", student.getFirst_name());
        model.addAttribute("last_name", student.getLast_name());
        return "portalParentAll";
    }

    @PatchMapping("saveStudent")
    public String saveStudent(@ModelAttribute Student student, Model model) {
        // String newName = String.valueOf(model.addAttribute("first_name", student.getFirst_name()));
        // String newLastName = String.valueOf(model.addAttribute("last_name", student.getLast_name()));
        student.setFirst_name(String.valueOf(model.addAttribute("first_name", student.getFirst_name())));
        student.setFirst_name(String.valueOf(model.addAttribute("last_name", student.getLast_name())));
        studentService.updateStudent(student);

        // student.setFirst_name(newName);
        // student.setLast_name(newLastName);
        return "portalParentAll";
    }


    @GetMapping("addPhoto")
    public String photo(@ModelAttribute Student student, Model model) {
        Photo photo = new Photo();
        model.addAttribute("photo", photo);
        //  model.addAttribute("id_student", studentService.getStudentById(StudentDTO.getId()));
        System.out.println("getMapping studentController - addPhoto");
        return "addPhoto";
    }


}
