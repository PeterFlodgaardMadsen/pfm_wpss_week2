/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pefl
 */
@WebServlet(name = "servlet_jps", urlPatterns = {"/servlet_jsp"})
public class servlet_jsp extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
     protected void processRequest(HttpServletRequest request, HttpServletResponse response) // vigtigt reqest response
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String fornavn = request.getParameter("fornavn");
        String efternavn= request.getParameter("efternavn");
        String by= request.getParameter("by");
        String email= request.getParameter("email");
        String mobil= request.getParameter("mobil");
        String fodselsar= request.getParameter("fodselsar");
        String kon= request.getParameter("kon");
        String beskrivelse= request.getParameter("beskrivelse");
        String link_til_billede= request.getParameter("link_til_billede");
        // regex = "^(.+)@(.+)$";
        PrintWriter out = response.getWriter();
       
    if (fornavn.isEmpty())
         { 
          out.println("<h2>Fejl i Fornavn, feltet er tomt, prøv ingen</h2>");
         }
    else if (efternavn.isEmpty())
         {  
          out.println("<h2>Fejl i Efternavn, feltet er tomt, prøv ingen</h2>");
         }
    else if (by.isEmpty())
         {  
           out.println("<h2>Fejl i By, feltet er tomt, prøv ingen</h2>");
         }
    else if (email.isEmpty())
         {
          out.println("<h2>Fejl i Email, feltet er tomt, prøv ingen</h2>");
         }
    else if (!email.contains("@"))
         {
          out.println("<h2>Fejl i Email, feltet du mangler @, prøv ingen</h2>");
         }
    else if (!email.contains("."))
         {
          out.println("<h2>Fejl i Email, feltet du mangler ., prøv ingen</h2>");
         }
    else if (mobil.isEmpty())
         {
          out.println("<h2>Fejl i Mobil, feltet er tomt, prøv ingen</h2>");
          }
    else if (kon==null)
         {
          out.println("<h2>Du har ikke valgt køn, feltet er tomt, prøv ingen</h2>");
          }     
    else 
          {
            RequestDispatcher rd = request.getRequestDispatcher("form.jsp");
            rd.forward(request,response);
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
    }// </editor-fold>

}


