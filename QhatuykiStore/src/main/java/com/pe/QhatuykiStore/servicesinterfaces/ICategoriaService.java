package com.pe.QhatuykiStore.servicesinterfaces;

import com.pe.QhatuykiStore.entities.Categoria;

import java.util.List;

public interface ICategoriaService {

    public void insert(Categoria categoria);
    public List<Categoria> list();
    public void delete(int id);
    public Categoria listId(int id);

}
