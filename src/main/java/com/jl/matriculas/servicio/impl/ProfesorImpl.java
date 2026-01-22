package com.jl.matriculas.servicio.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.jl.matriculas.servicio.IProfesorServicio;
import com.jl.matriculas.modelo.entidad.Profesor;
import com.jl.matriculas.repositorio.IProfesorRepositorio;

@Service
@Component
public class ProfesorImpl implements IProfesorServicio {
	@Autowired
	public IProfesorRepositorio repositorioProfesor;
	@Override
	public Profesor insertarProfesor(Profesor nuevoProfesor) {
		// TODO Auto-generated method stub
		return repositorioProfesor.save(nuevoProfesor);
}
	@Override
	public Profesor editarProfesor(int idProfesor) {
		// TODO Auto-generated method stub
		return repositorioProfesor.findById(idProfesor).get();
	}
	
	public void EliminarProfesor(int idProfesor) {
		// TODO Auto-generated method stub
		repositorioProfesor.delete(editarProfesor(idProfesor));
	}
	@Override
	public List<Profesor> listarProfesor() {
		// TODO Auto-generated method stub
		return repositorioProfesor.findAll();
	}
}