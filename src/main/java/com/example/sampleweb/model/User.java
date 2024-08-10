package com.example.sampleweb.model;

public class User {
    private int id;
    private String name;
    private String email;
    private String location;
    private String phone;

    // Constructors
    public User() {}

    public User(int id, String name, String email, String location, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.location = location;
        this.phone = phone;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
