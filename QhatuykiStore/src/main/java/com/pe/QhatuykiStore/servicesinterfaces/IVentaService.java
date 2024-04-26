package com.pe.QhatuykiStore.servicesinterfaces;

import com.pe.QhatuykiStore.entities.Venta;

import java.util.List;

public interface IVentaService {
    public void insert(Venta venta);
    public List<Venta> list();
    public void delete(Long idVenta);
    public Venta listarId(Long idVenta);
}
