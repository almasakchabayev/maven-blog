package com.epam.aa.blog.model;

public class Author extends User {
    public Author(Integer id, String name, String surname, String email, Integer[] commentIds) {
        super(id, name, surname, email, commentIds);
        super.setEditPost(true);
        super.setRole(super.ROLES[1]);
    }
}
