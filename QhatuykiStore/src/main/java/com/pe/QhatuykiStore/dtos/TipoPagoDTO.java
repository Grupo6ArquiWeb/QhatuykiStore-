package com.pe.QhatuykiStore.dtos;

import com.pe.QhatuykiStore.entities.Tarjeta;
import com.pe.QhatuykiStore.entities.Users;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class TipoPagoDTO {
    private int idTipPago;
    private String efectivo;
    private Tarjeta tarjeta;
    private Users users;

    public int getIdTipPago() {
        return idTipPago;
    }

    public void setIdTipPago(int idTipPago) {
        this.idTipPago = idTipPago;
    }

    public String getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(String efectivo) {
        this.efectivo = efectivo;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
}
