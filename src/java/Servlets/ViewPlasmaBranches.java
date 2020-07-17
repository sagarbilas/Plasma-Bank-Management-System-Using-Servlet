package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Models.PlasmaBranches;
import Dao.PlasmaBranchesDao;

//public class ViewPlasmaBranches extends HttpServlet {
//@WebServlet("/viewplasmabranches")
public class ViewPlasmaBranches extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("logged in as super-admin");
        out.println("<h1>Plasma Bank Branch List</h1>");

        List<PlasmaBranches> list = PlasmaBranchesDao.getAllPlasmaBranches();

        out.print("<table border='1' width='100%'");
        out.print("<tr><th>branch_id</th><th>branch_name</th><th>branch_location</th><th>branch_user_name</th><th>Edit</th><th>Delete</th></tr>");
        for (PlasmaBranches pb : list) {
            out.print("<tr><td>" + pb.getBranch_id()+ "</td><td>" + pb.getBranch_location()+ "</td><td>" + pb.getBranch_name() + "</td><td>" + pb.getBranch_user_name() + "</td><td><a href='EditServlet?id=" + pb.getBranch_id() + "'>edit</a></td><td><a href='DeleteServlet?id=" + pb.getBranch_id() + "'>delete</a></td></tr>");
        }
        out.print("</table>");
        
        out.print("</br>");
        out.println("<a href='addPlasmaBranches.html'>Add New Branch</a>");

        out.close();
        
    }
}
