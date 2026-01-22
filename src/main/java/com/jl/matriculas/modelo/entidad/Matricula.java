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

    public Matricula() {
    }

    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    public Date getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(Date fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    public String getDescripcionMatricula() {
        return descripcionMatricula;
    }

    public void setDescripcionMatricula(String descripcionMatricula) {
        this.descripcionMatricula = descripcionMatricula;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public Curso getFkIdCurso() {
        return fkIdCurso;
    }

    public void setFkIdCurso(Curso fkIdCurso) {
        this.fkIdCurso = fkIdCurso;
    }
}

