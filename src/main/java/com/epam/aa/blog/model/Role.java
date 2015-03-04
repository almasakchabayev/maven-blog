package com.epam.aa.blog.model;

import java.util.UUID;

public class Role extends BaseEntity {
    String name;

    public Role(String name) {
        this.name = name;
    }

    public Role(UUID uuid, String name) {
        super(uuid);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                '}';
    }
}