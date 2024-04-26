package com.pe.QhatuykiStore.servicesinterfaces;

import com.pe.QhatuykiStore.entities.Role;

import java.util.List;

public interface IRoleService {
    public void insert(Role rol);

    public List<Role> list();

    public void delete(Long idRol);

    public Role listarId(Long idRol);
}
