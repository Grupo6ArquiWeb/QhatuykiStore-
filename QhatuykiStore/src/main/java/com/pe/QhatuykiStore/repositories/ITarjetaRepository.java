package com.pe.QhatuykiStore.repositories;

import com.pe.QhatuykiStore.entities.Tarjeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITarjetaRepository extends JpaRepository<Tarjeta, Integer>{
    @Query(value = "SELECT tipo, COUNT(*) AS total_usos\n" +
            "FROM Tarjeta\n" +
            "GROUP BY tipo\n" +
            "ORDER BY total_usos DESC\n" +
            "LIMIT 1;", nativeQuery = true)
    List<String[]> tarjetaMasUsada();

    @Query(value = "SELECT \n" +
            "    id_tarjeta,\n" +
            "    numero,\n" +
            "    tipo,\n" +
            "    titular,\n" +
            "    fecha_vencimiento\n" +
            "FROM Tarjeta\n" +
            "WHERE fecha_vencimiento > CURRENT_DATE\n" +
            "ORDER BY fecha_vencimiento ASC\n" +
            "LIMIT 10;", nativeQuery = true)
    List<String[]> tarjetasPorVencer();
}
