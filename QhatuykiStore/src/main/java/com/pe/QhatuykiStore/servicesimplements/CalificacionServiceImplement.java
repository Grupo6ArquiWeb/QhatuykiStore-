package com.pe.QhatuykiStore.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pe.QhatuykiStore.entities.Calificacion;
import com.pe.QhatuykiStore.repositories.ICalificacionRepository;
import com.pe.QhatuykiStore.servicesinterfaces.ICalificacionService;

import java.util.List;

@Service
public class CalificacionServiceImplement implements ICalificacionService {

    @Autowired
    private ICalificacionRepository BR;
    @Override
    public void insertar(Calificacion b) {
        BR.save(b);
    }

    @Override
    public List<Calificacion> list() {
        return BR.findAll();
    }

}
