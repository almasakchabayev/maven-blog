package com.epam.aa.blog.model;

import java.util.List;

public class Post extends Publication {
    private int views;
    private List<Comment> comments;
    private Blog blog;
    private List<Tag> tags;
}