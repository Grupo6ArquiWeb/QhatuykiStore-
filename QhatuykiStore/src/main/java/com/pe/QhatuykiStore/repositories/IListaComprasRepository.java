package com.pe.QhatuykiStore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pe.QhatuykiStore.entities.ListaCompras;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IListaComprasRepository extends JpaRepository<ListaCompras, Integer> {

    @Query(value = "SELECT SUM(cantidad * id_producto) AS monto_total\n" +
            "FROM lista_compras",nativeQuery = true)
    List<String[]> MontoListaCompras();


    @Query(value = "SELECT MAX(cantidad * id_producto) AS monto_maximo\n" +
            "FROM lista_compras",nativeQuery = true)
    List<String[]> MaxListaCompras();

}
