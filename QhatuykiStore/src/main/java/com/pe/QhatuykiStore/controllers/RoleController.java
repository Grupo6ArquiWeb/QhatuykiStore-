package com.pe.QhatuykiStore.controllers;

import com.pe.QhatuykiStore.dtos.RolxUsuarioDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pe.QhatuykiStore.dtos.RoleDTO;
import com.pe.QhatuykiStore.entities.Role;
import com.pe.QhatuykiStore.servicesinterfaces.IRoleService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/roles")
public class RoleController {
    @Autowired
    private IRoleService rS;

    @PostMapping
    public void registrar(@RequestBody RoleDTO dto) {
        ModelMapper m = new ModelMapper();
        Role r = m.map(dto, Role.class);
        rS.insert(r);
    }

    @PutMapping
    public void modificar(@RequestBody RoleDTO dto) {
        ModelMapper m = new ModelMapper();
        Role r = m.map(dto, Role.class);
        rS.insert(r);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        rS.delete(id);
    }

    @GetMapping("/{id}")
    public RoleDTO listarId(@PathVariable("id") Long id) {
        ModelMapper m = new ModelMapper();
        RoleDTO dto = m.map(rS.listarId(id), RoleDTO.class);
        return dto;
    }

    @GetMapping
    public List<RoleDTO> listar() {
        return rS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, RoleDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/consulta01")
    public List<RolxUsuarioDTO> consulta01() {
        List<String[]> filaLista = rS.cantidadUsuariosRol();
        List<RolxUsuarioDTO> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista) {
            RolxUsuarioDTO dto = new RolxUsuarioDTO();
            dto.setRol(columna[0]);
            dto.setCantidadUsuariosxRol(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }

        return dtoLista;
    }

}
