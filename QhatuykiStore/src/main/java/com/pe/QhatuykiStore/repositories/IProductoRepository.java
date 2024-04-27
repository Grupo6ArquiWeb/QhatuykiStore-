package com.pe.QhatuykiStore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pe.QhatuykiStore.entities.Producto;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Long> {
}
