package com.pe.QhatuykiStore.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pe.QhatuykiStore.entities.Categoria;
import com.pe.QhatuykiStore.repositories.ICategoriaRepository;
import com.pe.QhatuykiStore.servicesinterfaces.ICategoriaService;

import java.util.List;
@Service

public class CategoriaServiceImplement implements ICategoriaService {

    @Autowired
    private ICategoriaRepository cR;
    @Override
    public void insert(Categoria categoria){
        cR.save(categoria);
    }

    @Override
    public List<Categoria> list() {
        return cR.findAll();
    }


    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        cR.deleteById(id);
    }

    @Override
    public Categoria listId(int id) {
        return cR.findById(id).orElse(new Categoria());

    }

    @Override
    public List<String[]> categoriaFrecuenteProductos() {
        return cR.categoriaFrecuenteProductos();
    }

    @Override
    public List<String[]> categoriaMasProductos() {
        return cR.categoriaMasProductos();
    }


}
