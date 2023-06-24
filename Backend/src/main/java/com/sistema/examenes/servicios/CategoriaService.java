package com.sistema.examenes.servicios;

import com.sistema.examenes.entidades.Categoria;

import java.util.Set;

public interface CategoriaService {

    public Categoria agregarCategoria(Categoria categoria);

    public Categoria actualizarCategoria(Categoria categoria);

    public Set<Categoria> obtenerCategorias();

    public Categoria obtenerCategoria(Long id);

    public void eliminarCategoria(Long id);
}
