package com.epam.aa.blog.model;

/**
 * Created by almas on 27/02/2015.
 */
public abstract class BaseEntity {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
