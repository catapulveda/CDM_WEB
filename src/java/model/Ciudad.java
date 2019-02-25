package model;

public class Ciudad {
    
    private int idciudad;
    private String nombreciudad;
    private String direccionciudad;
    private String telefonociudad;

    public Ciudad() {
    }

    public int getIdciudad() {
        return idciudad;
    }

    public void setIdciudad(int idciudad) {
        this.idciudad = idciudad;
    }

    public String getNombreciudad() {
        return nombreciudad;
    }

    public void setNombreciudad(String nombreciudad) {
        this.nombreciudad = nombreciudad;
    }

    public String getDireccionciudad() {
        return direccionciudad;
    }

    public void setDireccionciudad(String direccionciudad) {
        this.direccionciudad = direccionciudad;
    }

    public String getTelefonociudad() {
        return telefonociudad;
    }

    public void setTelefonociudad(String telefonociudad) {
        this.telefonociudad = telefonociudad;
    }

    @Override
    public String toString() {
        return nombreciudad;
    }   
        
}
