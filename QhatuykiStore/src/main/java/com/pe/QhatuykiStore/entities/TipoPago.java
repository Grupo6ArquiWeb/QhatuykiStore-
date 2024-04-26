package com.pe.QhatuykiStore.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Tipo_Pago")
public class TipoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipPago;
    @Column(name = "Efectivo", nullable = false, length = 55 )
    private String efectivo;
    @ManyToOne
    @JoinColumn(name = "id_tarjeta")
    private Tarjeta tarjeta;
    @ManyToOne
    @JoinColumn(name = "id")
    private Users users;
    public TipoPago() {}
    public TipoPago(int idTipPago,String efectivo, Tarjeta tarjeta, Users users) {
        this.idTipPago = idTipPago;
        this.efectivo = efectivo;
        this.tarjeta = tarjeta;
        this.users = users;
    }

    public int getidTipPago() {
        return idTipPago;
    }

    public void setidTipPago(int idTipoPago) {
        this.idTipPago = idTipoPago;
    }

    public String getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(String efectivo) {
        this.efectivo = efectivo;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
