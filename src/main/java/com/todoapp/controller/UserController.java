package com.todoapp.controller;

import com.todoapp.service.UserService;
import org.springframework.web.bind.annotation.*;
import com.todoapp.DTO.*;

@RestController 
@RequestMapping("/api")
public class UserController {
    private final UserService us;

    public UserController(UserService us){
        this.us = us;
    }

    //get data from body of the API request.@GetMapping("path")
    @PostMapping("/register")
    public UserDetails register(@RequestBody UserRegister user) {
        return us.register(user);
    }
    @PostMapping("/login")
    public UserDetails login(@RequestBody UserLogin user){
        return us.login(user);
    }
    
}
