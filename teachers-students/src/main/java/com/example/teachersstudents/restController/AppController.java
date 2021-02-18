package com.example.teachersstudents.restController;

import com.example.teachersstudents.model.Account;
import com.example.teachersstudents.model.AccountDTO;
import com.example.teachersstudents.model.Student;
import com.example.teachersstudents.model.StudentDTO;
import com.example.teachersstudents.repository.AccountRepository;
import com.example.teachersstudents.repository.StudentRepository;
import com.example.teachersstudents.service.AccountService;
import com.example.teachersstudents.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@AllArgsConstructor
@RequestMapping
public class AppController {

    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private AccountService accountService;
    @Autowired
    private StudentService studentService;

    //Mateusz
    @GetMapping("index")
    public String index() {
        return "index";
    }

    @GetMapping("login")
    public String login(Model model) {
        AccountDTO accountDTO = new AccountDTO();
        model.addAttribute("accountDTO", accountDTO);
        return "login";
    }

    @GetMapping("register")
    public String register(Model model) {
        Account account = new Account();
        model.addAttribute("account", account);
        return "register_m";
    }

    @GetMapping("portalTeacher")
    public String loginTeacher() {
        return "portalTeacher";
    }

    @GetMapping("portalParent")
    public String loginParent() {
        return "portalParent";
    }
//
//    @GetMapping("student")
//    public String student(Model model){
//        Student student = new Student();
//        model.addAttribute("student", student);
//        return "portalParent";
//    }



//    @GetMapping("/addStudent")
//    public String registerStudent(Model model){
//        model.addAttribute("student", new Student());
//        return "addStudent";
//    }
//
////    @PostMapping("/add_Student")
////    public String addStudent(Student student){
//        studentService.createStudent(student);
//        return "description";
//    }
//
//    @GetMapping("/listStudent")
//    public String listSstudent(Student student){
//        studentService.findAll();
//        return "description";
//    }

}
