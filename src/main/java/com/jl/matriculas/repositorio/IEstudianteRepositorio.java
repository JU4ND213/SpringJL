package com.jl.matriculas.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.jl.matriculas.modelo.entidad.Estudiante;

@Repository
@Component
public interface IEstudianteRepositorio extends JpaRepository<Estudiante, Integer>{
	Estudiante findByEmailEstudiante(String email);
}
