package com.epam.aa.blog.model;

import java.util.Date;

public class Post {

    private Integer id;
    private String title;
    private String content;
    private Date date;
    private Integer[] commentIds;
    private Integer authorId; //assume one author per post

    public Post() {
        super();
    }

    public Post(Integer id, String title, String content, Date date, Integer authorId) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.date = date;
        this.authorId = authorId;
    }

    //getters
    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Date getDate() {
        return date;
    }

    public Integer[] getCommentIds() {
        return commentIds;
    }

    public Integer getAuthorId() {
        return authorId;
    }


    //setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setCommentIds(Integer[] commentIds) {
        this.commentIds = commentIds;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }
}