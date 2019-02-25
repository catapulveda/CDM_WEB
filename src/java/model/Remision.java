package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Remision {
 
    private int idremision;
    private Despacho despacho;
    private String numero;
    private String nombrecliente;
    private String ciudad;
    private String destino;
    private String telefono;
    private String contrato;
    private String centrodecostos;
    private String conductor;
    private String cedula;
    private String placa;
    private LocalDate fecha;
    private String tipo;
    private String servicio;
    private String descripcion;
    private String factura;
    private String empresa;
    private boolean estado;
    private LocalDateTime fecharegistro;
    private Usuario usuario;
    private String empresatransportadora;
    private Cliente cliente;
    private String responsable;

    public Remision() {
    }

    public int getIdremision() {
        return idremision;
    }

    public void setIdremision(int idremision) {
        this.idremision = idremision;
    }

    public Despacho getDespacho() {
        return despacho;
    }

    public void setDespacho(Despacho despacho) {
        this.despacho = despacho;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getCentrodecostos() {
        return centrodecostos;
    }

    public void setCentrodecostos(String centrodecostos) {
        this.centrodecostos = centrodecostos;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public LocalDateTime getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(LocalDateTime fecharegistro) {
        this.fecharegistro = fecharegistro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getEmpresatransportadora() {
        return empresatransportadora;
    }

    public void setEmpresatransportadora(String empresatransportadora) {
        this.empresatransportadora = empresatransportadora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    @Override
    public String toString() {
        return numero;
    }
    
    
    
}
