package com.pe.QhatuykiStore.entities;

import jakarta.persistence.*;
import org.apache.catalina.User;

import java.time.LocalDate;

@Entity
@Table(name ="Calificacion" )
public class Calificacion
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCalificacion;

    @Column(name = "FechaHora", nullable = false)
    private LocalDate FechaHora;
    @ManyToOne
    @JoinColumn(name = "UserId")
    private Users user;

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public int getIdCalificacion() {
        return idCalificacion;
    }

    public void setIdCalificacion(int idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    public LocalDate getFechaHora() {
        return FechaHora;
    }

    public void setFechaHora(LocalDate fechaHora) {
        FechaHora = fechaHora;
    }
}
