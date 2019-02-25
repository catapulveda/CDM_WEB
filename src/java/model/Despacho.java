package model;

import java.time.LocalDate;

public class Despacho {
    
    private int iddespacho;
    private String nodespacho;
    private LocalDate fechadespacho;
    private Cliente cliente;
    private int peso;
    private boolean estado;
    private String descripcion;
    private Usuario idusuario;

    public Despacho() {
    }

    public int getIddespacho() {
        return iddespacho;
    }

    public void setIddespacho(int iddespacho) {
        this.iddespacho = iddespacho;
    }

    public String getNodespacho() {
        return nodespacho;
    }

    public void setNodespacho(String nodespacho) {
        this.nodespacho = nodespacho;
    }

    public LocalDate getFechadespacho() {
        return fechadespacho;
    }

    public void setFechadespacho(LocalDate fechadespacho) {
        this.fechadespacho = fechadespacho;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Usuario getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Usuario idusuario) {
        this.idusuario = idusuario;
    }

    @Override
    public String toString() {
        return nodespacho;
    }
    
    
}
