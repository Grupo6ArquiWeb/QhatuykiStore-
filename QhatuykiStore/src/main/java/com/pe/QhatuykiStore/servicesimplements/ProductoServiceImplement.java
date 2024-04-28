package com.pe.QhatuykiStore.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pe.QhatuykiStore.entities.Producto;
import com.pe.QhatuykiStore.repositories.IProductoRepository;
import com.pe.QhatuykiStore.servicesinterfaces.IProductoService;

import java.util.List;

@Service
public class ProductoServiceImplement implements IProductoService {

    @Autowired
    private IProductoRepository pR;
    @Override
    public void insert(Producto producto){
        pR.save(producto);
    }

    @Override
    public List<Producto> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        pR.deleteById((long) id);
    }

    @Override
    public Producto listId(int id) {
        return pR.findById((long) id).orElse(new Producto());

    }


}
