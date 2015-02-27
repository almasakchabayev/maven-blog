package com.epam.aa.blog.model;

import java.util.Date;
import java.util.List;

/**
 * Created by almas on 27/02/2015.
 */
public class Blog extends BaseEntity {
    private Date creationDate;
    private String theme;
    private User user;
    private List<Post> posts;
}
