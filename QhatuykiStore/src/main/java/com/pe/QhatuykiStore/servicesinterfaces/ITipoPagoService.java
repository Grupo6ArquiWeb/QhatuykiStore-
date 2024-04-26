package com.pe.QhatuykiStore.servicesinterfaces;

import com.pe.QhatuykiStore.entities.TipoPago;
import java.util.List;
public interface ITipoPagoService {
    public void insertar(TipoPago t);
    public TipoPago listarId(int idTipPago);
    public List<TipoPago> listar();
}
