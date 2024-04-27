package com.pe.QhatuykiStore.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProducto;
    private int idCategoria;

    @Column(name = "nombre")
    private  String nombre;
    @Column(name = "descripcion")
    private  String descripcion;
    @Column(name = "precio")
    private  int precio;
    @Column(name = "disponibilidad")
    private  boolean disponibilidad;
    @Column(name = "fotos")
    private  boolean fotos;


    public Producto(int idProducto, int idCategoria, String nombre, String descripcion, int precio, boolean disponibilidad, boolean fotos){
        this.idProducto = idProducto;
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
        this.fotos = fotos;
    }


    public Producto() {

    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public boolean isFotos() {
        return fotos;
    }

    public void setFotos(boolean fotos) {
        this.fotos = fotos;
    }
}
