package com.epam.aa.blog.model;


public class Guest extends User {
    public Guest(Integer id, String name, String surname, String email, Integer[] commentIds) {
        super(id, name, surname, email, commentIds);
        super.setRole(super.ROLES[3]);
    }
}
