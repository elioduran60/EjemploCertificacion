package org.eduran.ejemplocertificacion.ejemplocertificacion.fase2;

import java.util.List;

public class Cliente {

    private int id;
    private String nombre;
    private List<Orden> ordenes;  // Lista de órdenes que ha realizado el cliente

    public Cliente(int id, String nombre, List<Orden> ordenes) {
        this.id = id;
        this.nombre = nombre;
        this.ordenes = ordenes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Orden> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(List<Orden> ordenes) {
        this.ordenes = ordenes;
    }
}