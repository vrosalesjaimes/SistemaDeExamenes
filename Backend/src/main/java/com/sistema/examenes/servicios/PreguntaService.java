package com.sistema.examenes.servicios;

import com.sistema.examenes.entidades.Examen;
import com.sistema.examenes.entidades.Pregunta;

import java.util.Set;

public interface PreguntaService {

    public Pregunta agregarPregunta(Pregunta pregunta);

    public Pregunta actualzarPregunta(Pregunta pregunta);

    public Set<Pregunta> obtenerPreguntas();

    public Pregunta obtenerPregunta(Long id);

    public Set<Pregunta> obtenerPreguntasDelExamen(Examen examen);

    public void eliminarPregunta(Long id);

}
