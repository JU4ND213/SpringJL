package com.jl.matriculas.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jl.matriculas.modelo.entidad.Curso;
import com.jl.matriculas.modelo.entidad.Estudiante;
import com.jl.matriculas.modelo.entidad.Matricula;
import com.jl.matriculas.servicio.ICursoServicio;
import com.jl.matriculas.servicio.IEstudianteServicio;
import com.jl.matriculas.servicio.IMatriculaServicio;

@RestController
@RequestMapping ("/api/matricula")
public class MatriculaControlador {
	@Autowired
	private ICursoServicio servicioCurso;
	@Autowired 
	private IEstudianteServicio servicioEstudiante;
	@Autowired
	private IMatriculaServicio servicioMatricula;
	
	@GetMapping 
	public List<Matricula> listarMatricula(){
		return servicioMatricula.listarMatricula();
	}
	
	@PostMapping
	public Matricula insertarMatricula(@RequestBody Matricula matricula) {
		
		if(matricula.getFkIdCurso() != null &&
		   matricula.getFkIdCurso().getIdCurso() > 0 &&
		   matricula.getFkIdEstudiante() != null && 
		   matricula.getFkIdEstudiante().getIdEstudiante() > 0) {
			
			Curso curso = servicioCurso.editarCurso(
					matricula.getFkIdCurso().getIdCurso());
			Estudiante estudiante = servicioEstudiante.editarEstudiante(
					matricula.getFkIdEstudiante().getIdEstudiante());
			
			if(curso != null) {
				matricula.setFkIdCurso(curso);
			}else {
				throw new RuntimeException(
						"El curso no exite");
			}
			
			if(estudiante != null) {
				matricula.setFkIdEstudiante(estudiante);
			}else {
				throw new RuntimeException(
						"El estudiante no exite");
			}
		}else {
			throw new RuntimeException(
					"Falta curso o estudiante");
		}
		return servicioMatricula.insertarMatricula(matricula);
	}
}

