package com.jl.matriculas.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jl.matriculas.modelo.entidad.Matricula;

@Repository
public interface IMatriculaRepositorio extends JpaRepository<Matricula, Integer> {

    List<Matricula> findByIdEstudiante(int idEstudiante);

    List<Matricula> findByFkIdCurso_IdCurso(int idCurso);
}
