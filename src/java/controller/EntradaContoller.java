package controller;

import dao.ConexionBD;
import dao.EntradaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Cliente;

public class EntradaContoller extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        HttpSession sesion = req.getSession();
        
        Cliente cliente = (Cliente) sesion.getAttribute("cliente");
        if(cliente==null){
            resp.sendRedirect(req.getContextPath()+"/login.jsp");
        }else{
            ConexionBD con = new ConexionBD();
            EntradaDAO eDAO = new EntradaDAO(con);

            RequestDispatcher rd;

            req.setAttribute("entradas", eDAO.getEntradas(cliente.getIdcliente()));
            con.CERRAR();

            rd = req.getRequestDispatcher("/lotes.jsp");
            rd.forward(req, resp);
        }        
    }
    
    @Override
    public String getServletInfo() {
        return "Informacion del Servlet EntradaController";
    }

}
