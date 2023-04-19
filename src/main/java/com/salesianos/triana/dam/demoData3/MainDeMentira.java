package com.salesianos.triana.dam.demoData3;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.salesianos.triana.dam.demoData3.model.Alumno;
import com.salesianos.triana.dam.demoData3.model.Curso;
import com.salesianos.triana.dam.repos.AlumnoRepositorio;
import com.salesianos.triana.dam.repos.CursoRepositorio;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class MainDeMentira {
	
	@Autowired
	private final AlumnoRepositorio alumnorepositorio;
	private final CursoRepositorio cursorepositorio;
	
	
	@PostConstruct
	public void ejecutar() {
		Alumno a1 = new Alumno();
		a1.setNombre("Pepe");
		a1.setApellido("Juan José");
		a1.setEmail("pepe@gmail.com");
		
		Alumno a2 = new Alumno();
		a2.setNombre("Luis");
		a2.setApellido("Lucas de Tena");
		a2.setEmail("luis@gmail.com");
		
		alumnorepositorio.save(a1);
		alumnorepositorio.save(a2);
		
		Curso c1 = new Curso();
		c1.setNombre("Base de datos");
		c1.setProfesor("Luismiguel");
		
		cursorepositorio.save(c1);
		
		a1.setCurso(c1);
		a2.setCurso(c1);
		
		alumnorepositorio.save(a1);
		alumnorepositorio.save(a2);
		
		List<Curso> cursos = cursorepositorio.findAll();
		
		for (Curso curso: cursos) {
			System.out.println(curso);
			for(Alumno a : curso.getAlumnos()) {
				System.out.println(a);
			}
		}
	}

}
