package com.epam.aa.blog.model;

import java.util.List;

/**
 * Created by almas on 27/02/2015.
 */
public class Tag extends BaseEntity {
    private String name;
    private Blog blog;
    private List<Post> posts;
}
