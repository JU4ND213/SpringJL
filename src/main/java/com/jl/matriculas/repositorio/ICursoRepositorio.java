package com.jl.matriculas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jl.matriculas.modelo.entidad.Curso;

public interface ICursoRepositorio extends JpaRepository<Curso, Integer> {

	Curso findByNombreCurso(String nombre);

}
