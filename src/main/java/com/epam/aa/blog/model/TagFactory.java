package com.epam.aa.blog.model;

public class TagFactory {
    public static Tag createRandomTag() {
        Tag tag = new Tag();
        tag.setName(BlogFactory.createRandomString());
        //BLOG AND POSTS
        return tag;
    }
}
