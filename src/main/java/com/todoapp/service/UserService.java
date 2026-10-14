package com.todoapp.service;

import java.util.Objects;

import org.springframework.stereotype.Service;

import com.todoapp.DTO.UserDetails;
import com.todoapp.DTO.UserLogin;
import com.todoapp.DTO.UserRegister;
import com.todoapp.model.User;
import com.todoapp.repository.UserRepo;

@Service 
public class UserService {
    private final UserRepo userrepo;

    public UserService(UserRepo userrepo){
        this.userrepo = userrepo;
    }

    public UserDetails register(UserRegister dto){
        if(userrepo.existsByEmail(dto.getEmail())){
            throw new RuntimeException("email already exists bhaii");
        }
        User user = new User();
        user.setEmail(dto.getEmail());
        user.setName(dto.getName());
        user.setPass(dto.getPass());

        userrepo.save(user);

        return new UserDetails(
                user.getId(),
                user.getName(),
                user.getEmail()
        );
    }
    public UserDetails login(UserLogin dto){

        User user = userrepo.findByEmail(dto.getEmail())
                .orElseThrow(() ->
                    new RuntimeException("Invalid email or password"));
        if(!Objects.equals(dto.getPass(),user.getPass())){
            throw new RuntimeException("password is wrong brother");
        }

        return new UserDetails(
                user.getId(),
                user.getName(),
                user.getEmail()
        );
    }
    
}
