package Servlets;

import Dao.PlasmaSeekerDao;
import Models.PlasmaRequest;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddNewPlasmaRequest extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		//String plasma_seeker_id = request.getParameter("plasma_seeker_id");
		String name = request.getParameter("name");
		String location = request.getParameter("location");
		String address = request.getParameter("address");
                String nid = request.getParameter("nid");
		String plasma_type = request.getParameter("plasma_type");
                String number_of_bags_of_plasma = request.getParameter("number_of_bags_of_plasma");
                String contact_number = request.getParameter("contact_number");
                
                        
                        
                PlasmaRequest pr = new PlasmaRequest();
		//pr.setPlasma_seeker_id(Integer.parseInt(plasma_seeker_id) );
                pr.setName(name);
                pr.setLocation(location);
                pr.setAddress(address);
                pr.setNid(nid);
                pr.setPlasma_type(plasma_type);
                pr.setNumber_of_bags_of_plasma(Integer.parseInt(number_of_bags_of_plasma) );
                pr.setName(contact_number);
              
		int status = PlasmaSeekerDao.saveNewPlasmaRequest(pr);
                
		if(status>0){
			//out.print("<p>New Plasma Branch Added!</p>");
			//request.getRequestDispatcher("./viewplasmabranches").include(request, response);
                        response.sendRedirect("./viewplasmabranches");
		}else{
			out.println("Sorry. Something Went wrong. Record save attempt is unsuccessfull!");
		}
		
		out.close();
	}
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
