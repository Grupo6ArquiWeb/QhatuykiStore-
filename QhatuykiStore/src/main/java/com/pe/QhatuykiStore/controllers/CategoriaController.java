package com.pe.QhatuykiStore.controllers;


import com.pe.QhatuykiStore.dtos.CategoriaXProductoDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pe.QhatuykiStore.dtos.CategoriaDTO;
import com.pe.QhatuykiStore.entities.Categoria;
import com.pe.QhatuykiStore.servicesinterfaces.ICategoriaService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private ICategoriaService cS;

    @PostMapping
    public void insertar(@RequestBody CategoriaDTO caDTO){
        ModelMapper m=new ModelMapper();
        Categoria ca=m.map(caDTO,Categoria.class);
        cS.insert(ca);
    }
    @GetMapping
    public List<CategoriaDTO> listar(){
        return cS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,CategoriaDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void modificar(@RequestBody CategoriaDTO categoriaDTO){
        ModelMapper m=new ModelMapper();
        Categoria c=m.map(categoriaDTO,Categoria.class);
        cS.insert(c);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        cS.delete(id);
    }
    @GetMapping("/{id}")
    public CategoriaDTO listarId(@PathVariable("id")Integer id) {
        ModelMapper m=new ModelMapper();
        CategoriaDTO dto=m.map(cS.listId(id), CategoriaDTO.class);
        return dto;
    }
    @GetMapping("/consulta")
    public List<CategoriaXProductoDTO> consulta() {
        List<String[]> filaLista = cS.categoriaFrecuenteProductos();
        List<CategoriaXProductoDTO> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista) {
            CategoriaXProductoDTO dto = new CategoriaXProductoDTO();
            dto.setNombre(columna[0]);
            dto.setFrecuencia(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }

        return dtoLista;
    }
    @GetMapping("/consulta02")
    public List<CategoriaXProductoDTO> consulta02() {
        List<String[]> filaLista = cS.categoriaFrecuenteProductos();
        List<CategoriaXProductoDTO> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista) {
            CategoriaXProductoDTO dto = new CategoriaXProductoDTO();
            dto.setNombre(columna[0]);
            dto.setCantidadProdCat(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }

        return dtoLista;
    }





}
