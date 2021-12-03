package com.ita.u1.task1.servlet;

import com.ita.u1.task1.service.DataService;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(value = "")
public class MainServlet extends HttpServlet {

    public void init() {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("list", new DataService().getData());
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("list", new DataService().sortData());
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

    public void destroy() {
    }

//    private void processRequest(HttpServletRequest req, HttpServletResponse resp){
//
//    }
}