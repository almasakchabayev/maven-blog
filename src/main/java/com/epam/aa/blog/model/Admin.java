package com.epam.aa.blog.model;

public class Admin extends User {
    public Admin(Integer id, String name, String surname, String email, Integer[] commentIds) {
        super(id, name, surname, email, commentIds);
        super.setEditPost(true);
        super.setEditComment(true);
        super.setRole(super.ROLES[0]);
    }
}
