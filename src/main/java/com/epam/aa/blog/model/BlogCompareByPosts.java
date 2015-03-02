package com.epam.aa.blog.model;

import java.util.Comparator;

/**
 * Created by almas on 02/03/2015.
 */
public class BlogCompareByPosts implements Comparator<Blog> {
    @Override
    public int compare(Blog o1, Blog o2) {

        return o1.getPostsCount() < o2.getPostsCount() ? -1 :
                o1.getPostsCount() == o2.getPostsCount() ? 0 : -1;
    }
}
