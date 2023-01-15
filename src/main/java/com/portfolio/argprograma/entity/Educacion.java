/*

 */
package com.portfolio.argprograma.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Id;


@Getter @Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Size(min = 1, max = 60, message = "no cumple con la longitud")
    private String universidad;
    @NotNull
    @Size(min = 1, max = 140, message = "no cumple con la longitud")
    private String logo;
    @NotNull
    @Size(min = 1, max = 60, message = "no cumple con la longitud")
    private String titulo;
    @NotNull
    @Size(min = 1, max = 60, message = "no cumple con la longitud")
    private String institucion;
    @NotNull
    @Size(min = 1, max = 40, message = "no cumple con la longitud")
    private String estado;

    public Educacion() {
    }

    public Educacion(String universidad, String logo, String titulo, String institucion, String estado) {
        this.universidad = universidad;
        this.logo = logo;
        this.titulo = titulo;
        this.institucion = institucion;
        this.estado = estado;
    }
    
    
}
