package com.epam.aa.blog.model;


public class Comment extends BaseEntity {
    private Comment replyComment;
    private Post post;
}
