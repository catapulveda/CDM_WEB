package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Entrada {
        
    private int identrada;
    private Cliente cliente;
    private Ciudad ciudad;
    private Conductor conductor;
    private Usuario usuario;
    private int identradaalmacen;
    private String nombrepc;
    private String lote;
    private String contrato;
    private int op;
    private String centrodecostos;
    private LocalDate fecharecepcion;
    private LocalDateTime fecharegistrado;
    private LocalDateTime fechaactualizado;
    private LocalDateTime fechaliberado;
    private Boolean estado;
    private String observacion;
    private String placavehiculo;
    private boolean nuevo;
    private String representante;
    private int entregados;
    private int pendientes;

    public Entrada() {
    }

    public int getIdentrada() {
        return identrada;
    }

    public void setIdentrada(int identrada) {
        this.identrada = identrada;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getIdentradaalmacen() {
        return identradaalmacen;
    }

    public void setIdentradaalmacen(int identradaalmacen) {
        this.identradaalmacen = identradaalmacen;
    }

    public String getNombrepc() {
        return nombrepc;
    }

    public void setNombrepc(String nombrepc) {
        this.nombrepc = nombrepc;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public int getOp() {
        return op;
    }

    public void setOp(int op) {
        this.op = op;
    }

    public String getCentrodecostos() {
        return centrodecostos;
    }

    public void setCentrodecostos(String centrodecostos) {
        this.centrodecostos = centrodecostos;
    }

    public LocalDate getFecharecepcion() {
        return fecharecepcion;
    }

    public void setFecharecepcion(LocalDate fecharecepcion) {
        this.fecharecepcion = fecharecepcion;
    }

    public LocalDateTime getFecharegistrado() {
        return fecharegistrado;
    }

    public void setFecharegistrado(LocalDateTime fecharegistrado) {
        this.fecharegistrado = fecharegistrado;
    }

    public LocalDateTime getFechaactualizado() {
        return fechaactualizado;
    }

    public void setFechaactualizado(LocalDateTime fechaactualizado) {
        this.fechaactualizado = fechaactualizado;
    }

    public LocalDateTime getFechaliberado() {
        return fechaliberado;
    }

    public void setFechaliberado(LocalDateTime fechaliberado) {
        this.fechaliberado = fechaliberado;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getPlacavehiculo() {
        return placavehiculo;
    }

    public void setPlacavehiculo(String placavehiculo) {
        this.placavehiculo = placavehiculo;
    }

    public boolean isNuevo() {
        return nuevo;
    }

    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public int getEntregados() {
        return entregados;
    }

    public void setEntregados(int entregados) {
        this.entregados = entregados;
    }

    public int getPendientes() {
        return pendientes;
    }

    public void setPendientes(int pendientes) {
        this.pendientes = pendientes;
    }
    
    
}
