package com.sistema.examenes.servicios;

import com.sistema.examenes.entidades.Examen;

import java.util.Set;

public interface ExamenService {

    public Examen agregarExamen(Examen examen);

    public Examen actualizarExamen(Examen examen);

    public Set<Examen> obtenerExamenes();

    public Examen obtenerExamen(Long id);

    public void eliminarExamen(Long id);
}
