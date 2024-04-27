package com.pe.QhatuykiStore.servicesinterfaces;

import com.pe.QhatuykiStore.entities.Producto;

import java.util.List;

public interface IProductoService {

    public void insert(Producto producto);
    public List<Producto> list();
    public void delete(int id);
    public Producto listId(int id);

}
