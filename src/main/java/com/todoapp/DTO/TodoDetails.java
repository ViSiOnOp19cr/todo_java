package com.todoapp.DTO;

import java.time.LocalDate;

import com.todoapp.model.*;

public class TodoDetails {
    private Integer todoid;
    private String task;
    private LocalDate starDate;
    private LocalDate endDate;
    private User user;
    public Integer getTodoid() {
        return todoid;
    }
    public void setTodoid(Integer todoid) {
        this.todoid = todoid;
    }
    public String getTask() {
        return task;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public void setTask(String task) {
        this.task = task;
    }
    public LocalDate getStarDate() {
        return starDate;
    }
    public void setStarDate(LocalDate starDate) {
        this.starDate = starDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

}
