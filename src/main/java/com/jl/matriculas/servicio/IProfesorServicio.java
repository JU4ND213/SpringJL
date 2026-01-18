package com.jl.matriculas.servicio;

import java.util.List;

import com.jl.matriculas.modelo.entidad.Profesor;

public interface IProfesorServicio {

	public Profesor insertarProfesor(Profesor nuevoProfesor);
	public Profesor editarProfesor(int idProfesor);
	public void EliminarProfesor(int idProfesor);
	public List<Profesor> listarProfesor();

}
