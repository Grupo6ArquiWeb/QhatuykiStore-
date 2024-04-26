package com.pe.QhatuykiStore.controllers;

import com.pe.QhatuykiStore.entities.Tarjeta;
import org.modelmapper.ModelMapper;
import com.pe.QhatuykiStore.dtos.TarjetaDTO;
import com.pe.QhatuykiStore.servicesinterfaces.ITarjetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tarjetas")
public class TarjetaController {
    @Autowired
    private ITarjetaService tS;

    @PostMapping
    public void insertar(@RequestBody TarjetaDTO tarjetaDTO){
        ModelMapper m=new ModelMapper();
        Tarjeta c=m.map(tarjetaDTO, Tarjeta.class);
        tS.insert(c);
    }

    @PutMapping
    public void modificar(@RequestBody TarjetaDTO tarjetaDTO){
        ModelMapper m=new ModelMapper();
        Tarjeta c=m.map(tarjetaDTO, Tarjeta.class);
        tS.insert(c);
    }

    @GetMapping
    public List<TarjetaDTO> listar(){
        return tS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, TarjetaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
    	tS.delete(id);
    }
}
