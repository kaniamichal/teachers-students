package com.example.teachersstudents.exception;

public class AccountNotFoundException extends Exception{

    public AccountNotFoundException(){
        super("Account not found");
    }
}
