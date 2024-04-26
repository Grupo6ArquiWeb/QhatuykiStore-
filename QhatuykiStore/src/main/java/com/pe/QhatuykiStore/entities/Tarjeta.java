package com.pe.QhatuykiStore.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Tarjeta")
public class Tarjeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTarjeta;
    @Column(name = "titular", nullable = false)
    private String titular;
    @Column(name = "tipo", nullable = false)
    private String tipo;
    @Column(name = "numero", nullable = false)
    private String numero;
    @Column(name = "ccv", nullable = false)
    private int ccv;
    @Column(name = "fechaVencimiento", nullable = false)
    private LocalDate fechaVencimiento;
    @Column(name = "direccionFacturacion", nullable = false)
    private String direccionFacturacion;

    public Tarjeta() {
    }

    public Tarjeta(int idTarjeta, String titular, String tipo, String numero, int ccv, LocalDate fechaVencimiento, String direccionFacturacion ) {
        this.idTarjeta = idTarjeta;
        this.titular = titular;
        this.tipo = tipo;
        this.numero = numero;
        this.ccv = ccv;
        this.fechaVencimiento = fechaVencimiento;
        this.direccionFacturacion = direccionFacturacion;

    }

    public int getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getCcv() {
        return ccv;
    }

    public void setCcv(int ccv) {
        this.ccv = ccv;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getDireccionFacturacion() {
        return direccionFacturacion;
    }

    public void setDireccionFacturacion(String direccionFacturacion) {
        this.direccionFacturacion = direccionFacturacion;
    }


}
