package com.pe.QhatuykiStore.repositories;

import com.pe.QhatuykiStore.entities.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVentaRepository extends JpaRepository<Venta, Long> {
}
