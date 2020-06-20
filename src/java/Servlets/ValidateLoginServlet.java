package Servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.*;
import javax.servlet.RequestDispatcher;

public class ValidateLoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public ValidateLoginServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        String access_role = request.getParameter("role");

        HttpSession session = request.getSession();
        boolean flag = false;

        // JDBC code to connect mysql
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8080/testdemo", "root", "root");
            //con = DriverManager.getConnection("jdbc:mysql://localhost/login", "root", "");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/plasmabankmanagementsystem", "root", "root");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from logintable");

            while (rs.next()) {
                if (userName.equals(rs.getString(3)) && password.equals(rs.getString(4)) && access_role.equals(rs.getString(5))) {
                //session.setAttribute("user", userName);
                    flag = true;
                    //response.sendRedirect("./welcome");
                    //response.sendRedirect("https://www.studytonight.com");  
                   response.sendRedirect("welcome.html");
                }
            }
            if (flag == false) {
                RequestDispatcher rd = request.getRequestDispatcher("index.html");
                rd.include(request, response);
                out.print("invalid user id or password");
            }
        } catch (Exception p) {
            out.print(p);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
