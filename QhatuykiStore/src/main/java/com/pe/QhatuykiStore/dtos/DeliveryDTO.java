package com.pe.QhatuykiStore.dtos;

import com.pe.QhatuykiStore.entities.Users;


public class DeliveryDTO {
    private int idDelivery;
    private String direccionDelivery;
    private String estadoDelivery;
    private int telefono;
    private String datosAdicionales;
    private Users users;

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
