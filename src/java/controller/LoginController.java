package controller;

import dao.ClienteDAO;
import dao.ConexionBD;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Cliente;

public class LoginController extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        
        HttpSession sesion = request.getSession();
        String action = request.getParameter("action");
        if(action==null){
            if(sesion.getAttribute("cliente")==null){
                response.sendRedirect(request.getContextPath()+"/login.jsp");
            }else{
                response.sendRedirect(request.getContextPath()+"/lotes");
            }
        }else if(action.equals("end")){
            sesion.invalidate();
            response.sendRedirect(request.getContextPath()+"/login.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        
        String usuario = request.getParameter("username");
        String password = request.getParameter("password");                
        
        ConexionBD con = new ConexionBD();
        ClienteDAO cDAO = new ClienteDAO(con);
        Cliente cliente = cDAO.login(usuario, password);
        
        HttpSession sesion = request.getSession();
        RequestDispatcher rd;
        if(cliente!=null){
            sesion.setAttribute("cliente", cliente);
            response.sendRedirect(request.getContextPath()+"/lotes");
        }else{
            request.setAttribute("mensaje", "Usuario y/o contraseña incorrectos");
            rd = request.getRequestDispatcher("/login.jsp");            
            rd.forward(request, response);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
