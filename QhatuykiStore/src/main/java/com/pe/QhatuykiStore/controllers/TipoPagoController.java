package com.pe.QhatuykiStore.controllers;

import com.pe.QhatuykiStore.dtos.TipoPagoDTO;
import com.pe.QhatuykiStore.entities.TipoPago;
import com.pe.QhatuykiStore.servicesinterfaces.ITipoPagoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/TipoPago")
public class TipoPagoController {
    @Autowired
    private ITipoPagoService TS;

    @PostMapping
    public void insertar(@RequestBody TipoPagoDTO bd) {
        ModelMapper m = new ModelMapper();
        TipoPago b = m.map(bd, TipoPago.class);
        TS.insertar(b);

    }
    @GetMapping
    public List<TipoPagoDTO> listar() {
        return TS.listar().stream().map(y -> {
            ModelMapper c = new ModelMapper();
            return c.map(y, TipoPagoDTO.class);
        }).collect(Collectors.toList());
    }


}
