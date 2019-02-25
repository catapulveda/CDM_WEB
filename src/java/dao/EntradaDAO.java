package dao;

import dao.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Ciudad;
import model.Cliente;
import model.Entrada;

public class EntradaDAO {

    private ConexionBD con;
    
    public EntradaDAO(ConexionBD con) {
        this.con = con;
    }
    
    public List<Entrada> getEntradas(int idcliente) {
        List<Entrada> lista = new ArrayList<>();
        try {
            String sql = "select count(t.idremision) as entregados, \n" +
                    "COUNT(t.*)-count(t.idremision) as pendientes, \n" +
                    "e.identrada, c.nombrecliente, ciu.nombreciudad, e.lote, e.fecharecepcion::date, \n" +
                    "e.fecharegistrado, e.contrato, e.representante from entrada e\n" +
                    "inner join cliente c on c.idcliente=e.idcliente \n" +
                    "inner join ciudad ciu on ciu.idciudad=e.idciudad \n" +
                    "left join transformador t on t.identrada=e.identrada\n" +
                    "where e.idcliente="+idcliente+"\n" +
                    "group by c.idcliente, ciu.idciudad, e.identrada \n" +
                    "ORDER BY fecharecepcion DESC, fecharegistrado DESC;";
            ResultSet rs = con.CONSULTAR(sql);
            while(rs.next()){
                Entrada e = new Entrada();
                
                Cliente cliente = new Cliente();
                cliente.setNombrecliente(rs.getString("nombrecliente"));
                e.setCliente(cliente);
                
                Ciudad ciudad = new Ciudad();
                ciudad.setNombreciudad(rs.getString("nombreciudad"));
                e.setCiudad(ciudad);
                
                e.setIdentrada(rs.getInt("identrada"));
                e.setLote(rs.getString("lote"));
                e.setContrato(rs.getString("contrato"));
                e.setFecharecepcion(rs.getDate("fecharecepcion").toLocalDate());
                e.setEntregados(rs.getInt("entregados"));
                e.setPendientes(rs.getInt("pendientes"));
                
                lista.add(e);
            }            
        } catch (SQLException ex) {
            Logger.getLogger(EntradaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
}
