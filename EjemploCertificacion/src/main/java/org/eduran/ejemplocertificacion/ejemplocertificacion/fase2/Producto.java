package org.eduran.ejemplocertificacion.ejemplocertificacion.fase2;

public class Producto {
    private int id;
    private String nombre;
    private String categoria;
    private int stock;

    public Producto(int id, String nombre, String categoria, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getStock() {
        return stock;
    }
}

