package com.epam.aa.blog.model;

import java.util.Random;
import java.util.UUID;

public class RoleFactory {
    private static final Role ADMIN = new Role(new UUID(0xFFFFFFFF, 0xFFFFFFF1), "admin");
    private static final Role AUTHOR = new Role(new UUID(0xFFFFFFFF, 0xFFFFFFF1), "author");
    private static final Role GUEST = new Role(new UUID(0xFFFFFFFF, 0xFFFFFFF1), "guest");
    private static final Role[] roles = {ADMIN, AUTHOR, GUEST};
    private static final Random RANDOM = new Random();

    public static Role createRole(String roleName) {
        Role role = new Role(roleName);
        if (roleName.equals("admin")) return ADMIN;
        if (roleName.equals("author")) return AUTHOR;
        if (roleName.equals("guest")) return GUEST;
        return null;
    }

    public static Role getRandomRole() {
        return roles[RANDOM.nextInt(roles.length)];
    }
}
