package com.epam.aa.blog;

import com.epam.aa.blog.model.Post;

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
//        Post post1 = new Post("First Post", "What a great Blog", );

        PrintWriter out = response.getWriter();
        out.println("Hello, World!");
    }
}
