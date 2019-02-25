package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cliente;
import model.Despacho;
import model.Remision;
import model.Transformador;

public class TransformadorDAO {
    
    private ConexionBD con;

    public TransformadorDAO(ConexionBD con) {
        this.con = con;
    }
    
    public List<Transformador> getTrafos(int idlote){
        List<Transformador> lista = new ArrayList<>();
        
        String sql = "select * from transformador t \n" +
        "inner join entrada e on e.identrada=t.identrada\n" +
        "left join despacho d on d.iddespacho=t.iddespacho\n" +
        "left join remision r on r.idremision=t.idremision\n" +
        "where t.identrada="+idlote+";";
               
        try {
            ResultSet rs = con.CONSULTAR(sql);
            while(rs.next()){
                Transformador trafo = new Transformador();
                
                trafo.setIdtransformador(rs.getInt("idtransformador"));
                trafo.setEstado(rs.getString("estado"));
                trafo.setNumeroempresa(rs.getString("numeroempresa"));
                trafo.setNumeroserie(rs.getString("numeroserie"));
                trafo.setFase(rs.getInt("fase"));
                trafo.setKvasalida(rs.getDouble("kvasalida"));
                trafo.setTps(rs.getInt("tps"));
                trafo.setTss(rs.getInt("tss"));
                trafo.setTts(rs.getInt("tts"));
                trafo.setAno(rs.getInt("ano"));
                trafo.setPeso(rs.getInt("peso"));
                trafo.setObservacionsalida(rs.getString("observacionsalida"));
                trafo.setServiciosalida(rs.getString("serviciosalida"));
                trafo.setTipotrafosalida(rs.getString("tipotrafosalida"));                                
                
                Despacho despacho = new Despacho();
                despacho.setIddespacho(rs.getInt("iddespacho"));
                despacho.setNodespacho(rs.getString("nodespacho"));
                
                trafo.setDespacho(despacho);
                
                Remision remision = new Remision();
                remision.setIdremision(rs.getInt("idremision"));
                remision.setNumero(rs.getString("numero_remision"));
                
                trafo.setRemision(remision);
                
                lista.add(trafo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TransformadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lista;
    }
        
}
