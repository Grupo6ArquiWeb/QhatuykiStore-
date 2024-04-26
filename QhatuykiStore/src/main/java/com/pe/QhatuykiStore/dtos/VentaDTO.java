package com.pe.QhatuykiStore.dtos;

import com.pe.QhatuykiStore.entities.Users;

import java.time.LocalDateTime;

public class VentaDTO {
    private int idVenta;
    private Users Usuario;
    private double montoTotal;
    private LocalDateTime fechaHora;

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Users getUsuario() {
        return Usuario;
    }

    public void setUsuario(Users usuario) {
        Usuario = usuario;
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
