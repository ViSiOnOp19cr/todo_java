package com.todoapp.model;

import java.time.LocalDate;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity 
@Table(name = "todo")
public class Todo {
    @Id 
    @GeneratedValue 
    private Integer todoid;
    private String task;
    private LocalDate startDate;
    @ManyToOne 
    @JoinColumn(name="user_id",nullable=false)
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
    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public LocalDate getDuedate() {
        return duedate;
    }
    public void setDuedate(LocalDate duedate) {
        this.duedate = duedate;
    }
    private LocalDate duedate;

}
