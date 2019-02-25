package model;

public class Usuario {
        
    private int idusuario;
    private String nombreusuario;
    private String pass;
    private String pc;
    private boolean recordar;
    private String correo;

    public Usuario() {
        
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPc() {
        return pc;
    }

    public void setPc(String pc) {
        this.pc = pc;
    }

    public boolean isRecordar() {
        return recordar;
    }

    public void setRecordar(boolean recordar) {
        this.recordar = recordar;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return nombreusuario;
    }
    
    
    
}
