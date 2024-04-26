package com.pe.QhatuykiStore.repositories;

import com.pe.QhatuykiStore.entities.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDeliveryRepository extends JpaRepository<Delivery, Integer> {
}
