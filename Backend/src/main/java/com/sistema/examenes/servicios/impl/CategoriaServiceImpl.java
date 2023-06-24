package com.sistema.examenes.servicios.impl;

import com.sistema.examenes.entidades.Categoria;
import com.sistema.examenes.repositorios.CategoriaRepositorio;
import com.sistema.examenes.servicios.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepositorio categoriaRepositorio;

    @Override
    public Categoria agregarCategoria(Categoria categoria) {
        return categoriaRepositorio.save(categoria);
    }

    @Override
    public Categoria actualizarCategoria(Categoria categoria) {
        return categoriaRepositorio.save(categoria);
    }

    @Override
    public Set<Categoria> obtenerCategorias() {
        return new LinkedHashSet<Categoria>(categoriaRepositorio.findAll());
    }

    @Override
    public Categoria obtenerCategoria(Long id) {
        return categoriaRepositorio.findById(id).get();
    }

    @Override
    public void eliminarCategoria(Long id) {
        Categoria categoria = new Categoria();
        categoria.setCategoriaId(id);
        categoriaRepositorio.delete(categoria);
    }
}
