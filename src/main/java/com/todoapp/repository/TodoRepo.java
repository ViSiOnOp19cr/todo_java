package com.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.todoapp.DTO.*;
public interface TodoRepo extends JpaRepository<TodoDetails, Integer> {


}
