package com.github.gad1k.WebBI.dto;

import java.io.Serializable;

public class User implements Serializable {
    private String name;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
