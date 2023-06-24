package com.sistema.examenes.servicios.impl;

import com.sistema.examenes.entidades.Examen;
import com.sistema.examenes.entidades.Pregunta;
import com.sistema.examenes.repositorios.PreguntaRepositorio;
import com.sistema.examenes.servicios.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PreguntaServiceImpl implements PreguntaService {

    @Autowired
    private PreguntaRepositorio preguntaRepositorio;

    @Override
    public Pregunta agregarPregunta(Pregunta pregunta) {
        return preguntaRepositorio.save(pregunta);
    }

    @Override
    public Pregunta actualzarPregunta(Pregunta pregunta) {
        return preguntaRepositorio.save(pregunta);
    }

    @Override
    public Set<Pregunta> obtenerPreguntas() {
        return (Set<Pregunta>) preguntaRepositorio.findAll();
    }

    @Override
    public Pregunta obtenerPregunta(Long id) {
        return preguntaRepositorio.findById(id).get();
    }

    @Override
    public Set<Pregunta> obtenerPreguntasDelExamen(Examen examen) {
        return preguntaRepositorio.findByExamen(examen);
    }

    @Override
    public void eliminarPregunta(Long id) {
        Pregunta pregunta = new Pregunta();
        pregunta.setPreguntaId(id);
        preguntaRepositorio.delete(pregunta);
    }
}
