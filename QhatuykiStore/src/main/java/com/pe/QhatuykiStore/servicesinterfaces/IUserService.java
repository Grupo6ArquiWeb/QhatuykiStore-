package com.pe.QhatuykiStore.servicesinterfaces;

import com.pe.QhatuykiStore.entities.Users;

import java.util.List;

public interface IUserService {
    public void insert(Users usuario);

    public List<Users> list();

    public void delete(Long idUsuario);

    public Users listarId(Long idUsuario);
}
