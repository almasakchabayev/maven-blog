package com.epam.aa.blog.model;

import java.util.List;

public class Post extends BaseEntity implements Comparable<Post> {
    private int views;
    private List<Comment> comments;
    private Blog blog;
    private List<Tag> tags;


    @Override
    public int compareTo(Post o) {
        return views < o.views ? -1 :views == o.views ? 0 : 1;
    }
}