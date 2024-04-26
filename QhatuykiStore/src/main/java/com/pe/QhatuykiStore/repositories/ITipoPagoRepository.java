package com.pe.QhatuykiStore.repositories;

import com.pe.QhatuykiStore.entities.TipoPago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoPagoRepository extends JpaRepository<TipoPago, Integer> {
}
