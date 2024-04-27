package com.pe.QhatuykiStore.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "ListaCompras")
public class ListaCompras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idListaCompras;

    @ManyToOne
    @JoinColumn(name = "idVenta")
    private Venta venta;

    @Column(name = "Cantidad", nullable = false)
    private int Cantidad;

    @ManyToOne
    @JoinColumn(name = "idProducto")
    private Producto producto;

    public int getIdListaCompras() {
        return idListaCompras;
    }

    public void setIdListaCompras(int idListaCompras) {
        this.idListaCompras = idListaCompras;
    }

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
}
