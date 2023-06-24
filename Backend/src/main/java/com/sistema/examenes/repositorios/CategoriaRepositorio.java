package com.sistema.examenes.repositorios;

import com.sistema.examenes.entidades.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepositorio extends JpaRepository<Categoria, Long> {

}
