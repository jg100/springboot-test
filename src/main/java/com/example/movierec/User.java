package com.example.movierec;

public class User {
    private String name;

    public void init() {
        System.out.println("Init method called...");
    }

    public void destroy() {
        System.out.println("Destroy method called...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("The user is called: " + this.name);
    }

}
