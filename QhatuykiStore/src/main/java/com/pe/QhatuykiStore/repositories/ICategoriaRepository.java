package com.pe.QhatuykiStore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.pe.QhatuykiStore.entities.Categoria;

import java.util.List;

@Repository

public interface ICategoriaRepository extends JpaRepository<Categoria, Integer> {
    @Query(value = "SELECT c.nombre AS categoria, COUNT(*) AS frecuencia\n " +
            "FROM producto p\n " +
            "JOIN categoria c ON p.id_categoria = c.id_categoria\n " +
            "GROUP BY c.nombre\n " +
            "ORDER BY frecuencia DESC\n " +
            "LIMIT 1 ", nativeQuery = true)
    List<String[]> categoriaFrecuenteProductos();
    @Query(value = "SELECT c.nombre AS categoria, COUNT(p.id_producto) AS cantidadProductos\n " +
            "FROM categoria c\n " +
            "JOIN producto p ON c.id_categoria = p.id_categoria\n " +
            "GROUP BY c.nombre\n " +
            "ORDER BY cantidadProductos DESC\n " +
            "LIMIT 1 ", nativeQuery = true)
    List<String[]> categoriaMasProductos();


}
