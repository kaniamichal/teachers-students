package com.example.teachersstudents.service;

import com.example.teachersstudents.exception.UserNotFoundException;
import com.example.teachersstudents.model.User;
import com.example.teachersstudents.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private static final BCryptPasswordEncoder crypt = new BCryptPasswordEncoder();
    private final UserRepository repository;

    public void createUser(User user) {
        var password = crypt.encode(user.getPassword());
        user.setPassword(password);
        user.setEnabled(true);
        repository.save(user);
    }

    public User getUserByName(String userName) throws UserNotFoundException {
        return repository.getUserByUserName(userName).orElseThrow(UserNotFoundException::new);
    }


}
