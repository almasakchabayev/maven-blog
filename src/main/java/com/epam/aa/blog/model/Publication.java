package com.epam.aa.blog.model;

import java.util.Date;

/**
 * Created by almas on 27/02/2015.
 */
public abstract class Publication extends BaseEntity {
    private User author;
    private String title;
    private String body;
    private Date creationDate;
    int likes;
}
