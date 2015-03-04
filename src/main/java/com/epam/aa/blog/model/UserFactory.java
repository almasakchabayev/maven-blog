package com.epam.aa.blog.model;

import java.util.Random;

public class UserFactory {

    private static final Random RANDOM = new Random();

    public static User createRandomUser() {
        User user = new User();
        user.setFirstName(BlogFactory.createRandomString());
        user.setLastName(BlogFactory.createRandomString());
        user.setEmail(BlogFactory.createRandomString());
        user.setRegistrationDate(BlogFactory.createRandomDate());
        user.setRole(RoleFactory.getRandomRole());
        user = createRandomPosts(user);
//      comments
        return user;
    }
    private static User createRandomPosts(User user) {
        int upperBound = RANDOM.nextInt();
        if (upperBound > 10) upperBound = 10;
        if (upperBound < 1) upperBound = 1;
        for (int i = 0; i < upperBound; i++) {
            user.addPost(PostFactory.createRandomPost());
        }
        return user;
    }
}
