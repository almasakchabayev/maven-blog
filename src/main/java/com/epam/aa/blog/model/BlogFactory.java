package com.epam.aa.blog.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class BlogFactory {

    private static final Random RANDOM = new Random();

    public static Blog createRandomBlog() {
        Blog blog = new Blog();
        blog.setCreationDate(createRandomDate());
        blog.setTheme(createRandomString());
        blog.setUser(UserFactory.createRandomUser());
        blog = createRandomPosts(blog);
        blog = createRandomTags(blog);
        return blog;
    }

    public static String createRandomString() {
        String s = "";

        int upperBound = RANDOM.nextInt();
        if (upperBound > 10) upperBound = 10;
        if (upperBound < 1) upperBound = 1;
        for (int i = 0; i < upperBound; i++) {
            char c = (char) RANDOM.nextInt();
            s += c;
        }
        return s;
    }

    public static Date createRandomDate() {
        return new Date(RANDOM.nextLong());
    }

    private static Blog createRandomPosts(Blog blog) {
        int upperBound = RANDOM.nextInt();
        if (upperBound > 10) upperBound = 10;
        if (upperBound < 1) upperBound = 1;
        for (int i = 0; i < upperBound; i++) {
            Post randomPost = PostFactory.createRandomPost();
            randomPost.setBlog(blog);
            blog.addPost(randomPost);

        }
        return blog;
    }

    private static Blog createRandomTags(Blog blog) {
        int upperBound = RANDOM.nextInt();
        if (upperBound > 10) upperBound = 10;
        if (upperBound < 1) upperBound = 1;
        for (int i = 0; i < upperBound; i++) {
            Tag randomTag = TagFactory.createRandomTag();
            randomTag.setBlog(blog);
            blog.addTag(randomTag);

        }
        return blog;
    }
}
