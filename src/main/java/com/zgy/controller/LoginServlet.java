package com.zgy.controller;

import com.zgy.entity.Admin;
import com.zgy.entity.Book;
import com.zgy.entity.Borrow;
import com.zgy.entity.Reader;
import com.zgy.service.impl.BookServiceImpl;
import com.zgy.service.BookService;
import com.zgy.service.LoginService;
import com.zgy.service.impl.LoginServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private BookService bookService = new BookServiceImpl();
    private LoginService loginService = new LoginServiceImpl();
    /**
     * 处理登录的业务逻辑
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String type = req.getParameter("type");
        Object object = loginService.login(username,password,type);
        if (object != null){
            HttpSession session = req.getSession();
            switch (type){
                case "reader":
                    Reader reader = (Reader) object;
                    session.setAttribute("reader",reader);
                    //跳转到读者的首页
                    List<Book> list = bookService.findAll(1);
                    resp.sendRedirect("/book?page=1");
                    break;
                case "admin":
                    Admin admin = (Admin) object;
                    session.setAttribute("admin",admin);
                    //跳转到管理员的首页
                    //Model
                    resp.sendRedirect("/admin?method=findAllBorrow&page=1");
                    break;
            }
        }else {
            resp.sendRedirect("login.jsp");
        }
    }


}
