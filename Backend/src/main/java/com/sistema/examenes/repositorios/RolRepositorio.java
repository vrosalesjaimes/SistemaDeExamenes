package com.sistema.examenes.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.examenes.entidades.Rol;

public interface RolRepositorio extends  JpaRepository<Rol, Long> {
}