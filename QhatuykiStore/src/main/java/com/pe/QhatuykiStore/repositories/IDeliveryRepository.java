package com.pe.QhatuykiStore.repositories;

import com.pe.QhatuykiStore.entities.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDeliveryRepository extends JpaRepository<Delivery, Integer> {
    @Query(value = "SELECT u.username, COUNT(d.id_delivery) AS cantidad_entregas\n " +
            "FROM users u\n " +
            "LEFT JOIN roles r ON u.id = r.user_id\n " +
            "LEFT JOIN delivery d ON r.user_id = d.id\n " +
            "GROUP BY u.username\n " +
            "ORDER BY cantidad_entregas DES", nativeQuery = true)
    List<String[]> cantidadDeliveryUsuarios();
}
