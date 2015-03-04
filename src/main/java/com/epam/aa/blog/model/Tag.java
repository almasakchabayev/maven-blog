package com.epam.aa.blog.model;

import java.util.List;

/**
 * Created by almas on 27/02/2015.
 */
public class Tag extends BaseEntity {
    private String name;
    private Blog blog;
    private List<Post> posts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }



    @Override
    public String toString() {
        return "Tag{" +
                "name='" + name +
                '}';
    }
}

