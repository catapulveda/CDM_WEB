package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cliente;

public class ClienteDAO {

    private ConexionBD con;

    public ClienteDAO(ConexionBD con) {
        this.con = con;
    }
    
    public Cliente login(String user, String password){
        Cliente cliente = null;
        try {
            String sql = "SELECT * FROM cliente WHERE username=? AND password=?;";
            PreparedStatement pst = con.getCon().prepareStatement(sql);
            pst.setString(1, user);
            pst.setString(2, password);
                        
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                cliente = new Cliente();
                cliente.setIdcliente(rs.getInt("idcliente"));
                cliente.setNombrecliente(rs.getString("nombrecliente"));
                cliente.setNitcliente(rs.getString("nitcliente"));
                cliente.setRepresentante(rs.getString("representante"));
                cliente.setUsername(rs.getString("username"));
                cliente.setPassword(rs.getString("password"));
            }            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cliente;
    }
        
}
