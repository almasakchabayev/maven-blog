package com.epam.aa.blog;

import com.epam.aa.blog.model.Blog;
import com.epam.aa.blog.model.BlogFactory;

import java.io.IOException;
import java.io.PrintWriter;


public class Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request,
                          javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {

    }


    protected void doGet(javax.servlet.http.HttpServletRequest request,
                         javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
        Blog blog  = BlogFactory.createRandomBlog();


        PrintWriter out = response.getWriter();
        out.println(blog);
    }
}
