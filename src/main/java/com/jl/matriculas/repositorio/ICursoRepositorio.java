package com.jl.matriculas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.jl.matriculas.modelo.entidad.Curso;
@Repository
@Component

public interface ICursoRepositorio extends JpaRepository<Curso, Integer> {

	Curso findByNombreCurso(String nombre);

}
