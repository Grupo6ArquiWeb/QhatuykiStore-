package com.pe.QhatuykiStore.dtos;

public class CategoriaXProductoDTO {
    private int frecuencia;
    private String nombre;
    private int cantidadProdCat;

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadProdCat() {
        return cantidadProdCat;
    }

    public void setCantidadProdCat(int cantidadProdCat) {
        this.cantidadProdCat = cantidadProdCat;
    }
}
