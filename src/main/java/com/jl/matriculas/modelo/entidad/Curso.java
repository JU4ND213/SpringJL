package com.jl.matriculas.modelo.entidad;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Curso implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @GeneratedValue(
      strategy = GenerationType.IDENTITY
   )
   private int idCurso;
   private String nombreCurso;
   private String descripcionCurso;
   private String estadoCurso;
   @OneToMany(
      mappedBy = "fkIdCurso",
      cascade = {CascadeType.REFRESH}
   )
   @JsonBackReference
   private List<Matricula> listaMatricula = new ArrayList();

   @Generated
   public int getIdCurso() {
      return this.idCurso;
   }

   @Generated
   public String getNombreCurso() {
      return this.nombreCurso;
   }

   @Generated
   public String getDescripcionCurso() {
      return this.descripcionCurso;
   }

   @Generated
   public String getEstadoCurso() {
      return this.estadoCurso;
   }

   @Generated
   public List<Matricula> getListaMatricula() {
      return this.listaMatricula;
   }

   @Generated
   public void setIdCurso(final int idCurso) {
      this.idCurso = idCurso;
   }

   @Generated
   public void setNombreCurso(final String nombreCurso) {
      this.nombreCurso = nombreCurso;
   }

   @Generated
   public void setDescripcionCurso(final String descripcionCurso) {
      this.descripcionCurso = descripcionCurso;
   }

   @Generated
   public void setEstadoCurso(final String estadoCurso) {
      this.estadoCurso = estadoCurso;
   }

   @Generated
   public void setListaMatricula(final List<Matricula> listaMatricula) {
      this.listaMatricula = listaMatricula;
   }

   @Generated
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Curso)) {
         return false;
      } else {
         Curso other = (Curso)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getIdCurso() != other.getIdCurso()) {
            return false;
         } else {
            label61: {
               Object this$nombreCurso = this.getNombreCurso();
               Object other$nombreCurso = other.getNombreCurso();
               if (this$nombreCurso == null) {
                  if (other$nombreCurso == null) {
                     break label61;
                  }
               } else if (this$nombreCurso.equals(other$nombreCurso)) {
                  break label61;
               }

               return false;
            }

            label54: {
               Object this$descripcionCurso = this.getDescripcionCurso();
               Object other$descripcionCurso = other.getDescripcionCurso();
               if (this$descripcionCurso == null) {
                  if (other$descripcionCurso == null) {
                     break label54;
                  }
               } else if (this$descripcionCurso.equals(other$descripcionCurso)) {
                  break label54;
               }

               return false;
            }

            Object this$estadoCurso = this.getEstadoCurso();
            Object other$estadoCurso = other.getEstadoCurso();
            if (this$estadoCurso == null) {
               if (other$estadoCurso != null) {
                  return false;
               }
            } else if (!this$estadoCurso.equals(other$estadoCurso)) {
               return false;
            }

            Object this$listaMatricula = this.getListaMatricula();
            Object other$listaMatricula = other.getListaMatricula();
            if (this$listaMatricula == null) {
               if (other$listaMatricula != null) {
                  return false;
               }
            } else if (!this$listaMatricula.equals(other$listaMatricula)) {
               return false;
            }

            return true;
         }
      }
   }

   @Generated
   protected boolean canEqual(final Object other) {
      return other instanceof Curso;
   }

   @Generated
   public int hashCode() {
       int PRIME = 59;
       int result = 1;
       result = result * PRIME + this.getIdCurso();
       Object $nombreCurso = this.getNombreCurso();
       result = result * PRIME + ($nombreCurso == null ? 43 : $nombreCurso.hashCode());
       Object $descripcionCurso = this.getDescripcionCurso();
       result = result * PRIME + ($descripcionCurso == null ? 43 : $descripcionCurso.hashCode());
       Object $estadoCurso = this.getEstadoCurso();
       result = result * PRIME + ($estadoCurso == null ? 43 : $estadoCurso.hashCode());
       Object $listaMatricula = this.getListaMatricula();
       result = result * PRIME + ($listaMatricula == null ? 43 : $listaMatricula.hashCode());
       return result;
   }

   @Generated
   public String toString() {
      int var10000 = this.getIdCurso();
      return "Curso(idCurso=" + var10000 + ", nombreCurso=" + this.getNombreCurso() + ", descripcionCurso=" + this.getDescripcionCurso() + ", estadoCurso=" + this.getEstadoCurso() + ")";
   }

   @Generated
   public Curso() {
   }
}

