package com.pe.QhatuykiStore.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Venta")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVenta;
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Users usuario;
    @Column(name = "MontoTotal", nullable = false)
    private double montoTotal;
    @Column(name = "FechaHora", nullable = false)
    private LocalDateTime fechaHora;

    public Venta() {
    }

    public Venta(Long idVenta, Users usuario, double montoTotal, LocalDateTime fechaHora) {
        this.idVenta = idVenta;
        this.usuario = usuario;
        this.montoTotal = montoTotal;
        this.fechaHora = fechaHora;
    }

    public Long getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Long idVenta) {
        this.idVenta = idVenta;
    }

    public Users getUsuario() {
        return usuario;
    }

    public void setUsuario(Users usuario) {
        this.usuario = usuario;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }
}
