package com.pe.QhatuykiStore.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pe.QhatuykiStore.dtos.CalificacionDTO;
import com.pe.QhatuykiStore.entities.Calificacion;
import com.pe.QhatuykiStore.servicesinterfaces.ICalificacionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/calificaciones")
public class CalificacionController {
    @Autowired
    private ICalificacionService BS;

    @PostMapping
    public void insertar(@RequestBody CalificacionDTO bd) {
        ModelMapper m = new ModelMapper();
        Calificacion b = m.map(bd, Calificacion.class);
        BS.insertar(b);

    }

    @GetMapping
    public List<CalificacionDTO> list() {
        return BS.list().stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, CalificacionDTO.class);
        }).collect(Collectors.toList());
    }


}
