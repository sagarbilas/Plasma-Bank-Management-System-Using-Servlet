package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Models.PlasmaBranches;
import Dao.PlasmaBranchesDao;

//@WebServlet("/SaveServlet")
public class AddPlasmaBranches extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String branch_name = request.getParameter("branch_name");
		String branch_location = request.getParameter("branch_location");
		String branch_user_name = request.getParameter("branch_user_name");
		String password = request.getParameter("password");
                String role = request.getParameter("role");
		String contact_number = request.getParameter("contact_number");
                
                PlasmaBranches pb = new PlasmaBranches();
		pb.setBranch_name(branch_name);
		pb.setBranch_location(branch_location);
		pb.setBranch_user_name(branch_user_name);
                pb.setPassword(password);
                pb.setRole(role);
                pb.setContact_number(contact_number);
              
		int status = PlasmaBranchesDao.save(pb);
                
		if(status>0){
			//out.print("<p>New Plasma Branch Added!</p>");
			//request.getRequestDispatcher("./viewplasmabranches").include(request, response);
                        response.sendRedirect("./viewplasmabranches");
		}else{
			out.println("Sorry. Something Went wrong. Record save attempt is unsuccessfull!");
		}
		
		out.close();
	}

}