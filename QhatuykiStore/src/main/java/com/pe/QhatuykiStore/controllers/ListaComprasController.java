package com.pe.QhatuykiStore.controllers;

import com.pe.QhatuykiStore.dtos.MaxListaComprasDTO;
import com.pe.QhatuykiStore.dtos.MontoListaComprasDTO;
import com.pe.QhatuykiStore.dtos.RolxUsuarioDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pe.QhatuykiStore.dtos.ListaComprasDTO;
import com.pe.QhatuykiStore.entities.ListaCompras;
import com.pe.QhatuykiStore.servicesinterfaces.IListaComprasService;

import java.util.ArrayList;
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

    @GetMapping("/consulta01")
    public List<MontoListaComprasDTO> MontoListaComprasl() {
        List<String[]> filaLista = BS.MontoListaCompras();
        List<MontoListaComprasDTO> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista) {
            MontoListaComprasDTO dto = new MontoListaComprasDTO();
            dto.setMontoListaComprasID(Integer.parseInt(columna[0]));
            dtoLista.add(dto);
        }

        return dtoLista;
    }


    @GetMapping("/consulta02")
    public List<MaxListaComprasDTO> MaxListaCompras() {
        List<String[]> filaLista = BS.MaxListaCompras();
        List<MaxListaComprasDTO> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista) {
            MaxListaComprasDTO dto = new MaxListaComprasDTO();
            dto.setMaxListaComprasID(Integer.parseInt(columna[0]));
            dtoLista.add(dto);
        }

        return dtoLista;
    }


}
