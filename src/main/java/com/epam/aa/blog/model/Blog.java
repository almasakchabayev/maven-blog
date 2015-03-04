package com.epam.aa.blog.model;

import java.util.Comparator;
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
    public static final Comparator<Blog> POSTS_COMPARATOR = new PostsComparator();
    public static final Comparator<Blog> POSTS_COMPARATOR = Comparator.comparing();

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

    /**
     * Created by almas on 02/03/2015.
     */
    private static class PostsComparator implements Comparator<Blog> {
        @Override
        public int compare(Blog o1, Blog o2) {

            return o1.getPostsCount() < o2.getPostsCount() ? -1 :
                    o1.getPostsCount() == o2.getPostsCount() ? 0 : -1;
        }
    }
}
