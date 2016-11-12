/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static javax.swing.Spring.height;

/**
 *
 * @author pefl
 */
@WebServlet(name = "form_servlet", urlPatterns = {"/form_servlet"})
public class form_servlet extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8; application/x-www-form-urlencoded");
        
        String fornavn = request.getParameter("fornavn");
        String efternavn= request.getParameter("efternavn");
        String by= request.getParameter("by");
        String email= request.getParameter("email");
        String mobil= request.getParameter("mobil");
        String fodselsar= request.getParameter("fodselsar");
        String kon= request.getParameter("kon");
        String beskrivelse= request.getParameter("beskrivelse");
        String link_til_billede= request.getParameter("link_til_billede");
        
        
        PrintWriter out = response.getWriter();
        
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet form_servlet</title>");  
            out.println("<meta charset='UTF-8'>");
            out.println("<LINK REL='StyleSheet' HREF='css/styles.css' TYPE='text/css'>");
            out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
            out.println("</head>");
            out.println("<body>");
            //out.println("<h1>Servlet form_servlet at "+fornavn+efternavn+by+email+mobil+kon+beskrivelse+ "</h1>");
            out.println("<div id='menubar'>");
            out.println("<h2 id='navnmenu'>"+fornavn+"</h2></div>");
            
            out.println("<h1>Servlet som viser data fra bruger </h1>");
            out.println("<div>");
            out.println("<table><tr>");
            out.println("<th>Fornavn</th>");
            out.println("<th>Efternavn</th>");
            out.println("<th>By</th>");
            out.println("<th>Email</th>");
            out.println("<th>Mobil</th>");
            out.println("<th>Fødselsår</th>");
            out.println("<th>Køn</th>");
            out.println("<th>Beskrivelse</th>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>"+fornavn+"</td>");
            out.println("<td>"+efternavn+"</td>");
            out.println("<td>"+by+"</td>");
            out.println("<td>"+email+"</td>");
            out.println("<td>"+mobil+"</td>");
            out.println("<td>"+fodselsar+"</td>");
            out.println("<td>"+kon+"</td>");
            out.println("<td>"+beskrivelse+"</td>");
            out.println("</tr></table>");           
            out.println("<br></div>");
        
            
            out.println("<div>");
             out.println("<img src='"+link_til_billede+"' width ='40%' height ='40%' alt = 'Billede mangler'>");
               out.println("</div>");
              
           
            
            
            
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
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
