package com.pe.QhatuykiStore.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pe.QhatuykiStore.entities.ListaCompras;
import com.pe.QhatuykiStore.repositories.IListaComprasRepository;
import com.pe.QhatuykiStore.servicesinterfaces.IListaComprasService;

import java.util.List;

@Service
public class ListaComprasServiceImplement implements IListaComprasService {

    @Autowired
    private IListaComprasRepository BR;
    @Override
    public void insertar(ListaCompras b) {
        BR.save(b);
    }

    @Override
    public List<ListaCompras> list() {
        return BR.findAll();
    }

    public List<String[]> MontoListaCompras() {return BR.MontoListaCompras();}
    public List<String[]> MaxListaCompras() {return BR.MaxListaCompras();}

}
