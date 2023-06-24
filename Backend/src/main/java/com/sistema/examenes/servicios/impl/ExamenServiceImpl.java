package com.sistema.examenes.servicios.impl;

import com.sistema.examenes.entidades.Examen;
import com.sistema.examenes.repositorios.ExamenRepositorio;
import com.sistema.examenes.servicios.ExamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class ExamenServiceImpl implements ExamenService {

    @Autowired
    private ExamenRepositorio examenRepositorio;

    @Override
    public Examen agregarExamen(Examen examen) {
        return examenRepositorio.save(examen);
    }

    @Override
    public Examen actualizarExamen(Examen examen) {
        return examenRepositorio.save(examen);
    }

    @Override
    public Set<Examen> obtenerExamenes() {
        return new LinkedHashSet<>(examenRepositorio.findAll());
    }

    @Override
    public Examen obtenerExamen(Long id) {
        return examenRepositorio.findById(id).get();
    }

    @Override
    public void eliminarExamen(Long id) {
        Examen examen = new Examen();
        examen.setId(id);
        examenRepositorio.delete(examen);
    }
}
