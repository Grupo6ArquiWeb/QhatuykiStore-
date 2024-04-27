package com.pe.QhatuykiStore.repositories;
import com.pe.QhatuykiStore.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {
    @Query(value = "SELECT rol, COUNT(*) as cantidad_usuarios\n " +
            "FROM roles\n " +
            "WHERE rol IN ('admin', 'usuario')\n " +
            "GROUP BY rol ", nativeQuery = true)
    List<String[]> cantidadUsuariosRol();
}
