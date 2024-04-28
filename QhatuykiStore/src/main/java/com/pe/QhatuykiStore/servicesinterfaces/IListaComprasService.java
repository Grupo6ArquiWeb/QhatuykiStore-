package com.pe.QhatuykiStore.servicesinterfaces;
import com.pe.QhatuykiStore.entities.ListaCompras;

import java.util.List;

public interface IListaComprasService {

    public void insertar(ListaCompras b);
    public List<ListaCompras> list();
    List<String[]> MontoListaCompras();
    List<String[]> MaxListaCompras();
}
