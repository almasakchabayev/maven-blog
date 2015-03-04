package com.epam.aa.blog.model;

import java.util.UUID;

/**
 * Created by almas on 27/02/2015.
 */
public abstract class BaseEntity {
    private Integer id;
    private UUID uuid;
    private boolean deleted;

    public BaseEntity() {
        uuid = UUID.randomUUID();
    }

    public BaseEntity(UUID uuid) {
        this.uuid = uuid;
    }
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

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
