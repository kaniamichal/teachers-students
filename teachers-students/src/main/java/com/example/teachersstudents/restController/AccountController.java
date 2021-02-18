package com.example.teachersstudents.restController;

import com.example.teachersstudents.exception.AccountNotFoundException;
import com.example.teachersstudents.model.AccountDTO;
import com.example.teachersstudents.model.Student;
import com.example.teachersstudents.service.AccountService;
import com.example.teachersstudents.model.Account;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;


@Controller
@AllArgsConstructor
public class AccountController {

    private final AccountService service;

    @PostMapping("createAccount")
    public String createaccount(@ModelAttribute Account account) {
        service.createAccount(account);
        return "result";
    }

    @GetMapping("userLogin")
    public String login(@ModelAttribute AccountDTO accountDTO, Model model) throws AccountNotFoundException {
        //tu dodać klasę
        System.out.println(service.clazz(accountDTO.getLogin()));
        Student student = new Student();
        model.addAttribute("student", student);
        model.addAttribute("clazz", service.clazz(accountDTO.getLogin()));
        if (!service.login(accountDTO)) {
            return "register";
        }
        return service.isTeacher(accountDTO.getLogin()) ?
                "portalTeacher" :
                "portalParent";
    }




}
