package com.company.chatterbook.models;

import java.util.List;

public class User {
    private String name;
    private List<ChatterPost> chatterPosts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ChatterPost> getChatterPost() {
        return chatterPosts;
    }

    public void setChatterPosts(List<ChatterPost> chatterPosts) {
        this.chatterPosts = chatterPosts;
    }

    public User(String name) {
        this.name = name;
    }
}
