package com.pe.QhatuykiStore.servicesinterfaces;

import com.pe.QhatuykiStore.entities.Tarjeta;

import java.util.List;

public interface ITarjetaService {
    public void insert(Tarjeta tarjeta);
    public List<Tarjeta> list();
    public void delete(int id);
    List<String[]> tarjetaMasUsada();
    List<String[]> tarjetasPorVencer();
}
