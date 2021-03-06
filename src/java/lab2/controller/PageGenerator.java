/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author wsuetholz
 */
public class PageGenerator extends HttpServlet {

    private static int COLS = 3;
    private static int ROWS = 3;
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	response.setContentType("text/html;charset=UTF-8");
	try (PrintWriter out = response.getWriter()) {
	    /* TODO output your page here. You may use following sample code. */
	    String color = request.getParameter("color");
	    if (color == null || color.length() <= 0) {
		color = "Red";
	    }
	    String firstName = request.getParameter("firstName");
	    if (firstName == null || firstName.length() <= 0) {
		firstName = "Hey";
	    }
	    String lastName = request.getParameter("lastName");
	    if (lastName == null || lastName.length() <= 0) {
		lastName = "You";
	    }
	    out.println("<!DOCTYPE html>");
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<title>Servlet PageGenerator</title>");	    
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<h1>Servlet PageGenerator at " + request.getContextPath() + "</h1>");
	    
	    out.println("<h2>Name " + firstName + " " + lastName + "</h2>");
	    out.println("<h2>Sample " + color + " Table</h2>");
	    out.println("<table border=\"1\">");
	    out.println("<thead>");
	    out.println("<tr>");
	    for (int cols = 0; cols < COLS; cols++) {
		out.println("<th>Column " + Integer.toString(cols+1) + "</th>");
	    }
	    out.println("</tr>");
	    out.println("</thead>");

	    out.println("<tbody>");
	    for (int rows = 0; rows < ROWS; rows++) {
		out.println("<tr>");
		for (int cols = 0; cols < COLS; cols++) {
		    out.println("<td>Value " + Integer.toString(cols+1) + "</td>");
		}
		out.println("</tr>");	    
	    }
	    out.println("</tbody>");
	    
	    out.println("</table>");
	    
	    out.println("</body>");
	    out.println("</html>");
	    
	}
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
