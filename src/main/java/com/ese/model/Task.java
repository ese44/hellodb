package com.ese.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task{ // create the Task class

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // strategy for database

    // Task attributes
    private Long id;
    private String text;
    private boolean urgent;

    // constructor for a Task object
    public Task(String text, boolean urgent) {
        this.text = text;
        this.urgent = urgent;
    }

    // another constructor for a Task object that is created with no known attributes
    public Task(){}


    // setter and getter methods for the Task object
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }



}