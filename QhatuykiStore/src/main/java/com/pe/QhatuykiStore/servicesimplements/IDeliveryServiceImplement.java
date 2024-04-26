package com.pe.QhatuykiStore.servicesimplements;

import com.pe.QhatuykiStore.entities.Delivery;
import com.pe.QhatuykiStore.repositories.IDeliveryRepository;
import com.pe.QhatuykiStore.servicesinterfaces.IDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IDeliveryServiceImplement implements IDeliveryService {
    @Autowired
    private IDeliveryRepository dR;

    @Override
    public void insertDelivery(Delivery d) {
        dR.save(d);
    }

    @Override
    public List<Delivery> listarDelivery() {
        return dR.findAll();
    }

    @Override
    public Delivery listarId(int idDelivery) {
        return dR.findById(idDelivery).orElse(new Delivery());
    }
}
