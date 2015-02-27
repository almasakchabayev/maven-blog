package com.epam.aa.blog.model;

import java.util.Date;

/**
 * Created by almas on 27/02/2015.
 */
public class Blog extends BaseEntity {
    private User user;
    private Date creationDate;
    private String theme;
}
