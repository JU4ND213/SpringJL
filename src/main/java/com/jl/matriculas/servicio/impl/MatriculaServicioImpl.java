package com.jl.matriculas.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.jl.matriculas.modelo.entidad.Matricula;
import com.jl.matriculas.repositorio.IMatriculaRepositorio;
import com.jl.matriculas.servicio.IMatriculaServicio;

@Service
@Component
public class MatriculaServicioImpl implements IMatriculaServicio {

	@Autowired
	public IMatriculaRepositorio repositorioMatricula;
	@Override
	public Matricula insertarMatricula(Matricula nuevaMatricula) {
		// TODO Auto-generated method stub
		return repositorioMatricula.save(nuevaMatricula);
	}

	@Override
	public Matricula editarMatricula(int idMatricula) {
		// TODO Auto-generated method stub
		return repositorioMatricula.findById(idMatricula).get();
	}

	
	public void EliminarMatricula(int idMatricula) {
		// TODO Auto-generated method stub
		repositorioMatricula.delete(editarMatricula(idMatricula));
	}

	@Override
	public List<Matricula> listarMatricula() {
		// TODO Auto-generated method stub
		return repositorioMatricula.findAll();
	}

	@Override
	public void eliminarMatricula(int idMatricula) {
		// TODO Auto-generated method stub
		
	}

}