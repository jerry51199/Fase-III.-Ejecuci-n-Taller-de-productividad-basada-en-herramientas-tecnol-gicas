package com.papeleria.model;

import java.util.Date;

public class Venta {
    private int id;
    private int productoId;
    private int cantidad;
    private double total;
    private Date fecha;

    public Venta(int id, int productoId, int cantidad, double total, Date fecha) {
        this.id = id;
        this.productoId = productoId;
        this.cantidad = cantidad;
        this.total = total;
        this.fecha = fecha;
    }

    public int getId() { return id; }
    public int getProductoId() { return productoId; }
    public int getCantidad() { return cantidad; }
    public double getTotal() { return total; }
    public Date getFecha() { return fecha; }

    public void setProductoId(int productoId) { this.productoId = productoId; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    public void setTotal(double total) { this.total = total; }
    public void setFecha(Date fecha) { this.fecha = fecha; }
}
