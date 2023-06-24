package com.sistema.examenes.repositorios;

import com.sistema.examenes.entidades.Examen;
import com.sistema.examenes.entidades.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface PreguntaRepositorio extends JpaRepository<Pregunta, Long> {

    public  Set<Pregunta> findByExamen(Examen examen);
}
