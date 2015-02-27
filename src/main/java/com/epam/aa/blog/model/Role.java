package com.epam.aa.blog.model;

/**
 * Created by almas on 27/02/2015.
 */
public class Role {
    public static final Role ADMIN = new Role("admin");
    public static final Role AUTHOR = new Role("author");
    public static final Role GUEST = new Role("guest");
    String title;

    public Role(String title) {
        this.title = title;
    }

}
