package com.epam.aa.blog.model;

import java.util.List;

public class Post extends Publication {
    private int views;
    private List<Comment> comments;
    private Blog blog;
    private List<Tag> tags;

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    @Override
    public String toString() {
        return "Post{" +
                "views=" + views +
                '}';
    }
}