package com.pe.QhatuykiStore.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Delivery")
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDelivery;
    @Column(name = "DireccionDelivery", nullable = false, length = 50)
    private String direccionDelivery;
    @Column(name = "EstadoDelivery", nullable = false, length = 50)
    private String estadoDelivery;
    @Column(name = "Telefono",nullable = false, length = 55)
    private int telefono;
    @Column(name = "DatosAdicionales", nullable = false, length = 50)
    private String datosAdicionales;
    @ManyToOne
    @JoinColumn(name = "id")
    private Users users;
    public Delivery() {}
    public Delivery(int idDelivery,String direccionDelivery, String estadoDelivery, int telefono, String datosAdicionales, Users users) {
        this.idDelivery = idDelivery;
        this.direccionDelivery = direccionDelivery;
        this.estadoDelivery = estadoDelivery;
        this.telefono = telefono;
        this.datosAdicionales = datosAdicionales;
        this.users = users;
    }

    public int getIdDelivery() {
        return idDelivery;
    }

    public void setIdDelivery(int idDelivery) {
        this.idDelivery = idDelivery;
    }

    public String getDireccionDelivery() {
        return direccionDelivery;
    }

    public void setDireccionDelivery(String direccionDelivery) {
        this.direccionDelivery = direccionDelivery;
    }

    public String getEstadoDelivery() {
        return estadoDelivery;
    }

    public void setEstadoDelivery(String estadoDelivery) {
        this.estadoDelivery = estadoDelivery;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDatosAdicionales() {
        return datosAdicionales;
    }

    public void setDatosAdicionales(String datosAdicionales) {
        this.datosAdicionales = datosAdicionales;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
