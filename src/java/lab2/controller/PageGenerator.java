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
@WebServlet(name = "PageGenerator", urlPatterns = {"/pager"})
public class PageGenerator extends HttpServlet {

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
	    out.println("<!DOCTYPE html>");
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<title>Servlet PageGenerator</title>");	    
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<h1>Servlet PageGenerator at " + request.getContextPath() + "</h1>");
	    
	    out.println("<h2>Sample Table</h2>");
	    out.println("<table>");
	    out.println("<thead>");
	    out.println("<tr>");
	    out.println("<th>");
	    out.println("Column 1");
	    out.println("</th>");
	    out.println("<th>");
	    out.println("Column 2");
	    out.println("</th>");
	    out.println("<th>");
	    out.println("Column 3");
	    out.println("</th>");
	    out.println("</tr>");
	    out.println("</thead>");
	    out.println("<tbody>");
	    out.println("<tr>");
	    out.println("<td>");
	    out.println("Value 1");	    
	    out.println("</td>");	    
	    out.println("<td>");
	    out.println("Value 2");	    
	    out.println("</td>");	    
	    out.println("<td>");
	    out.println("Value 3");	    
	    out.println("</td>");	    
	    out.println("</tr>");	    
	    out.println("<tr>");
	    out.println("<td>");
	    out.println("Value 1");	    
	    out.println("</td>");	    
	    out.println("<td>");
	    out.println("Value 2");	    
	    out.println("</td>");	    
	    out.println("<td>");
	    out.println("Value 3");	    
	    out.println("</td>");	    
	    out.println("</tr>");	    
	    out.println("<tr>");
	    out.println("<td>");
	    out.println("Value 1");	    
	    out.println("</td>");	    
	    out.println("<td>");
	    out.println("Value 2");	    
	    out.println("</td>");	    
	    out.println("<td>");
	    out.println("Value 3");	    
	    out.println("</td>");	    
	    out.println("</tr>");	    
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
