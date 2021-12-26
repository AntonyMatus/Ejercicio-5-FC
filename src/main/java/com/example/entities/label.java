package com.example.entities;

public class label {

    private String name;

    public label() {
    }

    public label(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "label{" +
                "name='" + name + '\'' +
                '}';
    }
}
