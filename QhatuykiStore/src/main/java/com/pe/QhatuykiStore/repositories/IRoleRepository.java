package com.pe.QhatuykiStore.repositories;
import com.pe.QhatuykiStore.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {}
