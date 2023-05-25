/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import modelo.*;

/**
 *
 * @author juanc
 */
@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {

    arrayMet totalEquipos = new arrayMet();
    private int contadorID = 1;
    ArrayList eq1 = new ArrayList();
    ArrayList eq2 = new ArrayList();
    ArrayList eq3 = new ArrayList();
    ArrayList eq4 = new ArrayList();
    ArrayList eq5 = new ArrayList();
    ArrayList eq6 = new ArrayList();
    ArrayList eq7 = new ArrayList();
    ArrayList eq8 = new ArrayList();
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String eqp = request.getParameter("teamName");
        String cat = request.getParameter("categoria");
        int jug = Integer.parseInt(request.getParameter("jugadores"));
        int afi = Integer.parseInt(request.getParameter("aficionados"));
        String patr = request.getParameter("patrocinador");
        
        totalEquipos.adArray(cat, eqp, jug, cat, patr, afi);

        
        request.getSession().setAttribute("nombreE", totalEquipos.consultaArray());
        RequestDispatcher rd = request.getRequestDispatcher("eq1.jsp");
        rd.forward( request, response);
        
        
        
    }
    

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
