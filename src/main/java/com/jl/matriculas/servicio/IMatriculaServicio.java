package com.jl.matriculas.servicio;

import java.util.List;

import com.jl.matriculas.modelo.entidad.Matricula;



public interface IMatriculaServicio {

	public Matricula insertarMatricula(Matricula nuevaMatricula);
	public Matricula editarMatricula(int idMatricula);
	public void EliminarMatricula(int idMatricula);
	public List<Matricula> listarMatricula();
}
