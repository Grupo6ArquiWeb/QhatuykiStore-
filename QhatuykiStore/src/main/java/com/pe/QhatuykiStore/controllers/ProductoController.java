package com.pe.QhatuykiStore.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pe.QhatuykiStore.dtos.ProductoDTO;
import com.pe.QhatuykiStore.entities.Producto;
import com.pe.QhatuykiStore.servicesinterfaces.IProductoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private IProductoService pS;

    @PostMapping
    public void insertar(@RequestBody ProductoDTO proDTO){
        ModelMapper m=new ModelMapper();
        Producto pro=m.map(proDTO, Producto.class);
        pS.insert(pro);
    }
    @GetMapping
    public List<ProductoDTO> listar(){
        return pS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,ProductoDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void modificar(@RequestBody ProductoDTO productoDTO){
        ModelMapper m=new ModelMapper();
        Producto pro=m.map(productoDTO,Producto.class);
        pS.insert(pro);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        pS.delete(id);
    }
    @GetMapping("/{id}")
    public ProductoDTO listarId(@PathVariable("id")Integer id) {
        ModelMapper m=new ModelMapper();
        ProductoDTO dto=m.map(pS.listId(id), ProductoDTO.class);
        return dto;
    }

}
