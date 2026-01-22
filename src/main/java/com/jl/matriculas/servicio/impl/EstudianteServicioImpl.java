package com.jl.matriculas.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.jl.matriculas.modelo.entidad.Estudiante;
import com.jl.matriculas.repositorio.IEstudianteRepositorio;
import com.jl.matriculas.servicio.IEstudianteServicio;

@Service
@Component
public class EstudianteServicioImpl implements IEstudianteServicio{

	@Autowired
	public IEstudianteRepositorio repositorioEstudiante;
	@Override
	public Estudiante insertarEstudiante(Estudiante nuevoEstudiante) {
		// TODO Auto-generated method stub
		return repositorioEstudiante.save(nuevoEstudiante);
	}

	@Override
	public Estudiante editarEstudiante(int idEstudiante) {
		// TODO Auto-generated method stub
		return repositorioEstudiante.findById(idEstudiante).get();
	}

	
	public void EliminarEstudiante(int idEstudiante) {
		// TODO Auto-generated method stub
		repositorioEstudiante.delete(editarEstudiante(idEstudiante));
	}

	@Override
	public List<Estudiante> listarEstudiante() {
		// TODO Auto-generated method stub
		return repositorioEstudiante.findAll();
	}

	@Override
	public void eliminarEstudiante(int idEstudiante) {
		// TODO Auto-generated method stub
		
	}

}
