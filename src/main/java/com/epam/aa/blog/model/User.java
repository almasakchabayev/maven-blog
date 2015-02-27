package com.epam.aa.blog.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public abstract class User extends BaseEntity {

    private String name;
    private String surname;
    private String email;
    private String username;
    private String password;
    private String role;
    private Date joinDate;
    private List<Comment> comments = new ArrayList<Comment>;

    public enum Roles() {
        ADMIN, AUTHOR, SUBSCRIBER, GUEST,
        private boolean editPost; //move to enum
        private boolean editComment; //move to enum

    }
}
