package com.epam.aa.blog.model;

import java.util.Date;
import java.util.List;

/**
 * Created by almas on 27/02/2015.
 */
public class Blog extends BaseEntity implements Comparable<Blog> {
    private Date creationDate;
    private String theme;
    private User user;
    private List<Post> posts;
    private List<Tag> tags;

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getPostsCount() {
        return posts.size();
    }

    @Override
    public int compareTo(Blog blog) {
        return creationDate.compareTo(blog.creationDate);
    }
}
