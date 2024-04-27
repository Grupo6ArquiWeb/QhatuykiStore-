package com.pe.QhatuykiStore.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pe.QhatuykiStore.dtos.ListaComprasDTO;
import com.pe.QhatuykiStore.entities.ListaCompras;
import com.pe.QhatuykiStore.servicesinterfaces.IListaComprasService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/ListaCompras")
public class ListaComprasController {

    @Autowired
    private IListaComprasService BS;

    @PostMapping
    public void insertar(@RequestBody ListaComprasDTO bd) {
        ModelMapper m = new ModelMapper();
        ListaCompras b = m.map(bd, ListaCompras.class);
        BS.insertar(b);

    }

    @GetMapping
    public List<ListaComprasDTO> list() {
        return BS.list().stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, ListaComprasDTO.class);
        }).collect(Collectors.toList());
    }

}
