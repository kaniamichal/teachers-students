package com.example.teachersstudents.repository;

import com.example.teachersstudents.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

     Optional<User> getUserByUserName(String userName);

}
