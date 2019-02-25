package model;

public class Cliente {
    
    private int idcliente;
    private String nombrecliente;
    private String nitcliente;
    private String representante;
    private String username;
    private String password;
    
    public Cliente() {
    }
    
    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public String getNitcliente() {
        return nitcliente;
    }

    public void setNitcliente(String nitcliente) {
        this.nitcliente = nitcliente;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    @Override
    public String toString() {
        return nombrecliente;
    }    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
