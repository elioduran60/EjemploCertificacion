package org.eduran.ejemplocertificacion.ejemplocertificacion.fase2;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Orden {

    private int id;
    private BigDecimal total;
    private LocalDate fecha;
    private Cliente cliente;  // Relación con el cliente

    // Constructor
    public Orden(int id, BigDecimal total, LocalDate fecha, Cliente cliente) {
        this.id = id;
        this.total = total;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}