package com.example.chatapplication.models;

import java.io.Serializable;

public class User implements Serializable {
    public String name,image,email,token,id;

    // Constructor
    public User() {
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getImage() {
        return image;
    }

    public String getToken() {
        return token;
    }
}
