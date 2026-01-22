package com.jl.matriculas.controlador;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jl.matriculas.modelo.entidad.Curso;
import com.jl.matriculas.servicio.ICursoServicio;

@RestController
@RequestMapping({"/api/curso"})
public class CursoControlador {
   @Autowired
   private ICursoServicio servicioCurso;

   public CursoControlador() {
   }

   @GetMapping
   public List<Curso> listarCurso() {
      return this.servicioCurso.listarCurso();
   }

   @PostMapping
   public Curso crearCurso(@RequestBody Curso curso) {
      return this.servicioCurso.insertarCurso(curso);
   }

   @GetMapping({"/{id}"})
   public Curso editarCurso(@PathVariable int id) {
      return this.servicioCurso.editarCurso(id);
   }

   @DeleteMapping({"/{id}"})
   public void eliminarCurso(@PathVariable int id) {
      this.servicioCurso.eliminarCurso(id);
   }
}
