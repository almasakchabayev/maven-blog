package com.epam.aa.blog.model;

/**
 * Created by almas on 27/02/2015.
 */
public abstract class BaseEntity {
    private Integer id;
    private boolean deleted;

    public BaseEntity() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
