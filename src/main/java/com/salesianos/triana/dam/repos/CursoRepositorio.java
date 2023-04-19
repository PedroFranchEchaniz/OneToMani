package com.salesianos.triana.dam.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianos.triana.dam.demoData3.model.Curso;

public interface CursoRepositorio extends JpaRepository <Curso, Long> {

}
