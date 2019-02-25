package model;

public class Conductor {
    
    private int idconductor;
    private String cedulaconductor;
    private String nombreconductor;

    public Conductor() {
    }

    public int getIdconductor() {
        return idconductor;
    }

    public void setIdconductor(int idconductor) {
        this.idconductor = idconductor;
    }

    public String getCedulaconductor() {
        return cedulaconductor;
    }

    public void setCedulaconductor(String cedulaconductor) {
        this.cedulaconductor = cedulaconductor;
    }

    public String getNombreconductor() {
        return nombreconductor;
    }

    public void setNombreconductor(String nombreconductor) {
        this.nombreconductor = nombreconductor;
    }        

    @Override
    public String toString() {
        return nombreconductor;
    }   
    
}
