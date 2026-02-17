package com.jl.matriculas.modelo.entidad;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Profesor implements Serializable {

	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProfesor;
	
	private String nombreProfesor;
	private String ApellidoProfesor;
	private String emailProfesor;
	private String direccionProfesor;
	private String estadoProfesor;
}
