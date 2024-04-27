package com.pe.QhatuykiStore.controllers;

import com.pe.QhatuykiStore.dtos.DeliveryDTO;
import com.pe.QhatuykiStore.dtos.DeliveryxUsuarioDTO;
import com.pe.QhatuykiStore.entities.Delivery;
import com.pe.QhatuykiStore.servicesinterfaces.IDeliveryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Delivery")
public class DeliveryController {
    @Autowired
    private IDeliveryService dS;

    @PostMapping
    public void insertar(@RequestBody DeliveryDTO bd) {
        ModelMapper m = new ModelMapper();
        Delivery d = m.map(bd, Delivery.class);
        dS.insertDelivery(d);

    }
    @GetMapping
    public List<DeliveryDTO> listar() {
        return dS.listarDelivery().stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, DeliveryDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public DeliveryDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        DeliveryDTO dto = m.map(dS.listarId(id), DeliveryDTO.class);
        return dto;
    }
    @GetMapping("/consulta02")
    public List<DeliveryxUsuarioDTO> consulta02() {
        List<String[]> filaLista = dS.cantidadDeliveryUsuarios();
        List<DeliveryxUsuarioDTO> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista) {
            DeliveryxUsuarioDTO dto = new DeliveryxUsuarioDTO();
            dto.setUsername(columna[0]);
            dto.setCantidadDeliveriesxUsuario(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }

        return dtoLista;

    }
}
