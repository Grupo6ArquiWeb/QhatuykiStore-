package com.pe.QhatuykiStore.dtos;

import com.pe.QhatuykiStore.entities.Users;

import java.time.LocalDate;

public class CalificacionDTO {
    private int idCalificacion;
    private LocalDate FechaHora;
    private Users user;

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public LocalDate getFechaHora() {
        return FechaHora;
    }

    public void setFechaHora(LocalDate fechaHora) {
        FechaHora = fechaHora;
    }

    public int getIdCalificacion() {
        return idCalificacion;
    }

    public void setIdCalificacion(int idCalificacion) {
        this.idCalificacion = idCalificacion;
    }
}
