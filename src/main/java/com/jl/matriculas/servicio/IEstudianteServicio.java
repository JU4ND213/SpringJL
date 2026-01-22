package com.jl.matriculas.servicio;

import java.util.List;

import com.jl.matriculas.modelo.entidad.Estudiante;

public interface IEstudianteServicio {
	   Estudiante insertarEstudiante(Estudiante nuevoEstudiante);

	   Estudiante editarEstudiante(int idEstudiante);

	   void eliminarEstudiante(int idEstudiante);

	   List<Estudiante> listarEstudiante();
	}
