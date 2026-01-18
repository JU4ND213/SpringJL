package com.jl.matriculas.servicio;

import java.util.List;

import com.jl.matriculas.modelo.entidad.Estudiante;

public interface IEstudianteServicio {

	public Estudiante insertarEstudiante(Estudiante nuevoEstudiante);
	public Estudiante editarEstudiante(int idEstudiante);
	public void EliminarEstudiante(int idEstudiante);
	public List<Estudiante> listarEstudiante();
}
