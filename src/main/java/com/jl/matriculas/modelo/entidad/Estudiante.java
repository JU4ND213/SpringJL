package com.jl.matriculas.modelo.entidad;
import lombok.Generated;
import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Estudiante implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
   @GeneratedValue(
      strategy = GenerationType.IDENTITY
   )
   private int idEstudiante;
   private String nombreEstudiante;
   private String apellidoEstudiante;
   private String emailEstudiante;
   private String direccionEstudiante;
   private String celuldarEstudiante;
   private String estadoEstudiante;

   @Generated
   public int getIdEstudiante() {
      return this.idEstudiante;
   }

   @Generated
   public String getNombreEstudiante() {
      return this.nombreEstudiante;
   }

   @Generated
   public String getApellidoEstudiante() {
      return this.apellidoEstudiante;
   }

   @Generated
   public String getEmailEstudiante() {
      return this.emailEstudiante;
   }

   @Generated
   public String getDireccionEstudiante() {
      return this.direccionEstudiante;
   }

   @Generated
   public String getCeluldarEstudiante() {
      return this.celuldarEstudiante;
   }

   @Generated
   public String getEstadoEstudiante() {
      return this.estadoEstudiante;
   }

   @Generated
   public void setIdEstudiante(final int idEstudiante) {
      this.idEstudiante = idEstudiante;
   }

   @Generated
   public void setNombreEstudiante(final String nombreEstudiante) {
      this.nombreEstudiante = nombreEstudiante;
   }

   @Generated
   public void setApellidoEstudiante(final String apellidoEstudiante) {
      this.apellidoEstudiante = apellidoEstudiante;
   }

   @Generated
   public void setEmailEstudiante(final String emailEstudiante) {
      this.emailEstudiante = emailEstudiante;
   }

   @Generated
   public void setDireccionEstudiante(final String direccionEstudiante) {
      this.direccionEstudiante = direccionEstudiante;
   }

   @Generated
   public void setCeluldarEstudiante(final String celuldarEstudiante) {
      this.celuldarEstudiante = celuldarEstudiante;
   }

   @Generated
   public void setEstadoEstudiante(final String estadoEstudiante) {
      this.estadoEstudiante = estadoEstudiante;
   }

   @Generated
   public boolean equals(final Object o) {
      if (o == this) {
         return true;
      } else if (!(o instanceof Estudiante)) {
         return false;
      } else {
         Estudiante other = (Estudiante)o;
         if (!other.canEqual(this)) {
            return false;
         } else if (this.getIdEstudiante() != other.getIdEstudiante()) {
            return false;
         } else {
            Object this$nombreEstudiante = this.getNombreEstudiante();
            Object other$nombreEstudiante = other.getNombreEstudiante();
            if (this$nombreEstudiante == null) {
               if (other$nombreEstudiante != null) {
                  return false;
               }
            } else if (!this$nombreEstudiante.equals(other$nombreEstudiante)) {
               return false;
            }

            Object this$apellidoEstudiante = this.getApellidoEstudiante();
            Object other$apellidoEstudiante = other.getApellidoEstudiante();
            if (this$apellidoEstudiante == null) {
               if (other$apellidoEstudiante != null) {
                  return false;
               }
            } else if (!this$apellidoEstudiante.equals(other$apellidoEstudiante)) {
               return false;
            }

            label71: {
               Object this$emailEstudiante = this.getEmailEstudiante();
               Object other$emailEstudiante = other.getEmailEstudiante();
               if (this$emailEstudiante == null) {
                  if (other$emailEstudiante == null) {
                     break label71;
                  }
               } else if (this$emailEstudiante.equals(other$emailEstudiante)) {
                  break label71;
               }

               return false;
            }

            label64: {
               Object this$direccionEstudiante = this.getDireccionEstudiante();
               Object other$direccionEstudiante = other.getDireccionEstudiante();
               if (this$direccionEstudiante == null) {
                  if (other$direccionEstudiante == null) {
                     break label64;
                  }
               } else if (this$direccionEstudiante.equals(other$direccionEstudiante)) {
                  break label64;
               }

               return false;
            }

            Object this$celuldarEstudiante = this.getCeluldarEstudiante();
            Object other$celuldarEstudiante = other.getCeluldarEstudiante();
            if (this$celuldarEstudiante == null) {
               if (other$celuldarEstudiante != null) {
                  return false;
               }
            } else if (!this$celuldarEstudiante.equals(other$celuldarEstudiante)) {
               return false;
            }

            Object this$estadoEstudiante = this.getEstadoEstudiante();
            Object other$estadoEstudiante = other.getEstadoEstudiante();
            if (this$estadoEstudiante == null) {
               if (other$estadoEstudiante != null) {
                  return false;
               }
            } else if (!this$estadoEstudiante.equals(other$estadoEstudiante)) {
               return false;
            }

            return true;
         }
      }
   }

   @Generated
   protected boolean canEqual(final Object other) {
      return other instanceof Estudiante;
   }

   @Generated
   public int hashCode() {
      int PRIME = 59;
      int result = 1;
      result = result * 59 + this.getIdEstudiante();
      Object $nombreEstudiante = this.getNombreEstudiante();
      result = result * 59 + ($nombreEstudiante == null ? 43 : $nombreEstudiante.hashCode());
      Object $apellidoEstudiante = this.getApellidoEstudiante();
      result = result * 59 + ($apellidoEstudiante == null ? 43 : $apellidoEstudiante.hashCode());
      Object $emailEstudiante = this.getEmailEstudiante();
      result = result * 59 + ($emailEstudiante == null ? 43 : $emailEstudiante.hashCode());
      Object $direccionEstudiante = this.getDireccionEstudiante();
      result = result * 59 + ($direccionEstudiante == null ? 43 : $direccionEstudiante.hashCode());
      Object $celuldarEstudiante = this.getCeluldarEstudiante();
      result = result * 59 + ($celuldarEstudiante == null ? 43 : $celuldarEstudiante.hashCode());
      Object $estadoEstudiante = this.getEstadoEstudiante();
      result = result * 59 + ($estadoEstudiante == null ? 43 : $estadoEstudiante.hashCode());
      return result;
   }

   @Generated
   public String toString() {
      int var10000 = this.getIdEstudiante();
      return "Estudiante(idEstudiante=" + var10000 + ", nombreEstudiante=" + this.getNombreEstudiante() + ", apellidoEstudiante=" + this.getApellidoEstudiante() + ", emailEstudiante=" + this.getEmailEstudiante() + ", direccionEstudiante=" + this.getDireccionEstudiante() + ", celuldarEstudiante=" + this.getCeluldarEstudiante() + ", estadoEstudiante=" + this.getEstadoEstudiante() + ")";
   }

   @Generated
   public Estudiante() {
   }
}
