package com.pe.QhatuykiStore.dtos;

import com.pe.QhatuykiStore.entities.Venta;

public class ListaComprasDTO {

    private int idListaCompras;
    private Venta venta;
    private int Cantidad;
    private Producto producto;


    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public int getIdListaCompras() {
        return idListaCompras;
    }

    public void setIdListaCompras(int idListaCompras) {
        this.idListaCompras = idListaCompras;
    }
}
