package com.epam.aa.blog.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post extends BaseEntity {

    private String title;
    private String content;
    private Date date;
    private List<Comment> comments = new ArrayList<Comment>;
    private Author author;

}