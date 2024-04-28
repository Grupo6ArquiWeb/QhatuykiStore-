package com.pe.QhatuykiStore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pe.QhatuykiStore.entities.Categoria;

@Repository

public interface ICategoriaRepository extends JpaRepository<Categoria, Integer> {


}
