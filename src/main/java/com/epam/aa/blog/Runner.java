package com.epam.aa.blog;

import com.epam.aa.blog.model.Blog;
import com.epam.aa.blog.model.BlogFactory;

public class Runner {
    public static void main(String[] args) {
        Blog blog  = BlogFactory.createRandomBlog();
        System.out.println(blog);
    }
}
