package com.todoapp.service;

import com.todoapp.repository.*;

import java.time.LocalDate;
import com.todoapp.DTO.*;

import com.todoapp.model.*;

public class TodoService {

    private final TodoRepo tr;
    private final UserRepo ur;


    public TodoService(TodoRepo tr, UserRepo ur){
        this.tr = tr;
        this.ur = ur;
    }

    public TodoDetails createTodo(TodoDetails dto,Integer userId){

        User user = ur.findById(userId)
        .orElseThrow(()-> new RuntimeException("userid not found bhaii"));
        dto.setUser(user);
        dto.setStarDate(LocalDate.now());
        Todo to = tr.save(dto);

    }

}
