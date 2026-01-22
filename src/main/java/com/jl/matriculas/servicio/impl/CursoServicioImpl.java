package com.jl.matriculas.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.jl.matriculas.modelo.entidad.Curso;
import com.jl.matriculas.repositorio.ICursoRepositorio;
import com.jl.matriculas.servicio.ICursoServicio;

@Service
@Component
public class CursoServicioImpl implements ICursoServicio {
   @Autowired
   public ICursoRepositorio repositorioCurso;

   public CursoServicioImpl() {
   }

   public Curso insertarCurso(Curso nuevoCurso) {
      return (Curso)this.repositorioCurso.save(nuevoCurso);
   }

   public Curso editarCurso(int idCurso) {
      return (Curso)this.repositorioCurso.findById(idCurso).get();
   }

   public void eliminarCurso(int idCurso) {
      this.repositorioCurso.delete(this.editarCurso(idCurso));
   }

   public List<Curso> listarCurso() {
      return this.repositorioCurso.findAll();
   }
}
