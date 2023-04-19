package com.salesianos.triana.dam.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianos.triana.dam.demoData3.model.Alumno;

public interface AlumnoRepositorio extends JpaRepository <Alumno, Long> {

}
