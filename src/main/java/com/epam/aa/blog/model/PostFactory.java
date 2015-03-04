package com.epam.aa.blog.model;

import java.util.Random;

public class PostFactory {

    public static final Random RANDOM = new Random();

    public static Post createRandomPost() {
        Post post= new Post();
        post.setLikes(RANDOM.nextInt());
        post.setBody(BlogFactory.createRandomString());
        post.setTitle(BlogFactory.createRandomString());
        return post;
//        private int views;
//        private List<Comment> comments;
//        private Blog blog;
//        private List<Tag> tags;
//        private User author;
//        private Date creationDate;
    }
}
