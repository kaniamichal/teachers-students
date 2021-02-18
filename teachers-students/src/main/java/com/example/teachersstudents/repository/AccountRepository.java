package com.example.teachersstudents.repository;

import com.example.teachersstudents.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    Long getAccountById(Long id);

    Optional<Account> getAccountByLogin(String login);


}
