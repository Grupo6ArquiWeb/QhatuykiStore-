package com.pe.QhatuykiStore.dtos;

import org.apache.catalina.User;

import java.time.LocalDate;

public class CalificacionDTO {
    private int idCalificacion;
    private LocalDate FechaHora;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
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
