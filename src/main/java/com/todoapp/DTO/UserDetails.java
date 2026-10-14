package com.todoapp.DTO;

public class UserDetails {

    private Integer id;
    private String email;
    private String name;

    public UserDetails(Integer id, String email, String name) {
        this.id = id;
        this.email = email;
        this.name = name;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String pass) {
        this.name = pass;
    }
    

}
