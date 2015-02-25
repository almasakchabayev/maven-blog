package com.epam.aa.blog.model;

import java.util.Date;


public abstract class User {
    public static final String[] ROLES = {"Admin", "Author", "Subscriber", "Guest"};
    private Integer id;
    private String name;
    private String surname;
    private String email;
    private String username;
    private String password;
    private String role;
    private Date joinDate;
    private boolean editPost;
    private boolean editComment;
    private Integer[] commentIds;

    public User(Integer id, String name, String surname, String email, Integer[] commentIds) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.commentIds = commentIds;
        this.joinDate = new Date();
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public Integer[] getCommentIds() {
        return commentIds;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCommentIds(Integer[] commentIds) {
        this.commentIds = commentIds;
    }

    public boolean isEditComment() {
        return editComment;
    }

    public void setEditComment(boolean editComment) {
        this.editComment = editComment;
    }

    public boolean isEditPost() {
        return editPost;
    }

    public void setEditPost(boolean editPost) {
        this.editPost = editPost;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
