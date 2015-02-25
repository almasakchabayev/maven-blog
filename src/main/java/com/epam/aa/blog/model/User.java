package com.epam.aa.blog.model;

/**
 * Created by almas on 23/02/2015.
 */
public abstract class User {
    public static final String[] ROLES = {"Admin", "Author", "Subscriber", "Guest"};
    private Integer id;
    private String name;
    private String surname;
    private String email;
    private String role;
    private boolean editPost = false;
    private boolean editComment = false;
    private Integer[] commentIds;

    public User(Integer id, String name, String surname, String email, Integer[] commentIds) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.commentIds = commentIds;
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
}
