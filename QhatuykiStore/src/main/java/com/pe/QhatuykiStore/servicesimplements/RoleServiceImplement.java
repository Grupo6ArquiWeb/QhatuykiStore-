package com.pe.QhatuykiStore.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pe.QhatuykiStore.entities.Role;
import com.pe.QhatuykiStore.repositories.IRoleRepository;
import com.pe.QhatuykiStore.servicesinterfaces.IRoleService;

import java.util.List;

@Service
public class RoleServiceImplement implements IRoleService {
    @Autowired
    private IRoleRepository rR;

    @Override
    public void insert(Role rol) {
        rR.save(rol);
    }

    @Override
    public List<Role> list() {
        return rR.findAll();
    }

    @Override
    public void delete(Long idRol) {
        rR.deleteById(idRol);
    }

    @Override
    public Role listarId(Long idRol) {
        return rR.findById(idRol).orElse(new Role());
    }

    @Override
    public List<String[]> cantidadUsuariosRol() {
        return rR.cantidadUsuariosRol();
    }
}
