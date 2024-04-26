package com.pe.QhatuykiStore.repositories;

import com.pe.QhatuykiStore.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<Users, Long> {
    public Users findByUsername(String username);
}
