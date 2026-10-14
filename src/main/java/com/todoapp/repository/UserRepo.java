package com.todoapp.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todoapp.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{
   Boolean existsByEmail(String email);
   Optional<User>findByEmail(String email);
   Optional<User>findById(Integer id);
}
