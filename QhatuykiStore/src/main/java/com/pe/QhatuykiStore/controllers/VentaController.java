package com.pe.QhatuykiStore.controllers;

import com.pe.QhatuykiStore.dtos.VentaDTO;
import com.pe.QhatuykiStore.entities.Venta;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pe.QhatuykiStore.servicesinterfaces.IVentaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/ventas")
public class VentaController {
    @Autowired
    private IVentaService vS;
    @PostMapping
    public void insertar(@RequestBody VentaDTO bd) {
        ModelMapper m = new ModelMapper();
        Venta b = m.map(bd, Venta.class);
        vS.insert(b);
    }

    @GetMapping
    public List<VentaDTO> listar() {
        return vS.list().stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, VentaDTO.class);
        }).collect(Collectors.toList());
    }
}
