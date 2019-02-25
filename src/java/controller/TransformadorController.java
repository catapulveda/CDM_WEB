package controller;

import dao.ConexionBD;
import dao.TransformadorDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Transformador;

public class TransformadorController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        String idlote = req.getParameter("idlote");
        
        ConexionBD con = new ConexionBD();
        TransformadorDAO tDAO = new TransformadorDAO(con);        
        
        RequestDispatcher rd;
  
        List<Transformador> lista = tDAO.getTrafos(Integer.parseInt(idlote));
        System.out.println("TAMAÑO "+lista.size());
        req.setAttribute("detalleLote", lista);
        con.CERRAR();
        
        rd = req.getRequestDispatcher("/lote.jsp");
        rd.forward(req, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
