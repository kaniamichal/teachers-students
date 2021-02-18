package com.example.teachersstudents.service;

import com.example.teachersstudents.exception.AccountNotFoundException;
import com.example.teachersstudents.model.Account;
import com.example.teachersstudents.model.AccountDTO;
import com.example.teachersstudents.repository.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import java.util.Optional;

@Service
@AllArgsConstructor
public class AccountService {

    private AccountRepository repository;

    public Long getAccount(Long id){
        return repository.getAccountById(id);
    }

    public Account createAccount(Account account) {
        return repository.save(account);
    }

    public boolean login(AccountDTO accountDTO) throws AccountNotFoundException {
        Account existingAccount = repository.getAccountByLogin(accountDTO.getLogin()).orElseThrow(AccountNotFoundException::new);
        return existingAccount.getPassword().equals(accountDTO.getPassword());
    }

    public boolean isTeacher (String login) throws AccountNotFoundException {
        return repository.getAccountByLogin(login)
                .map(Account::isTeacher)
                .orElseThrow(AccountNotFoundException::new);
    }

    public String clazz(String login) throws AccountNotFoundException{
        String clasa = repository.getAccountByLogin(login).get().getClazz();
        return clasa;

    }




}
