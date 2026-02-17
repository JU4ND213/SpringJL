package com.jl.matriculas.modelo.entidad;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Matricula implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int idMatricula;
    private Date fechaMatricula;
    private String descripcionMatricula;
    private int idEstudiante;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "fkIdCurso")
    private Curso fkIdCurso;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "fkIdEstudiante")
    private Estudiante fkIdEstudiante;

    public void setFkIdEstudiante(Estudiante estudiante) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setFkIdEstudiante'");
    }

    public void setFkIdCurso(Curso curso) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setFkIdCurso'");
    }

    public Estudiante getFkIdEstudiante() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFkIdEstudiante'");
    }

    public Curso getFkIdCurso() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFkIdCurso'");
    }
}

