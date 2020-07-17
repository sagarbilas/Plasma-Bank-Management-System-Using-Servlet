package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Models.NewPlasmaSeeker;
import Models.Login;

import Dao.PlasmaSeekerDao;

//@WebServlet("/SaveServlet")
public class RegisterNewPlasmaSeeker extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String location = request.getParameter("location");
		String address = request.getParameter("address");
		String nid = request.getParameter("nid");
                String mobile_number = request.getParameter("mobile_number");
		String password = request.getParameter("password");
                
                NewPlasmaSeeker pb = new NewPlasmaSeeker();
		pb.setName(name);
		pb.setLocation(location);
		pb.setAddress(address);
                pb.setNid(nid);
                pb.setMobileNo(mobile_number);
                pb.setPassword(password);
                
                Login lgn = new Login();
                lgn.setName(name);
              	lgn.setUserName(name);
		lgn.setPassword(password);
                lgn.setRole("plasma-seeker");
                
		int status = PlasmaSeekerDao.saveNewPlasmaSeeker(pb,lgn);
                
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
