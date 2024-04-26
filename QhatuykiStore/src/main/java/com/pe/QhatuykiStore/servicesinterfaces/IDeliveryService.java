package com.pe.QhatuykiStore.servicesinterfaces;

import com.pe.QhatuykiStore.entities.Delivery;

import java.util.List;

public interface IDeliveryService {
    public void insertDelivery(Delivery d);
    public List<Delivery> listarDelivery();
    public Delivery listarId(int idDelivery);
}
