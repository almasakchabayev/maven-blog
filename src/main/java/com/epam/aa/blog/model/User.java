package com.epam.aa.blog.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class User extends BaseEntity {
    private String firstName;
    private String lastName;
    private String email;
    private String passwordHash;
    private Date registrationDate;
    private Role role;
    private List<Post> posts;
    private List<Comment> comments;


}
