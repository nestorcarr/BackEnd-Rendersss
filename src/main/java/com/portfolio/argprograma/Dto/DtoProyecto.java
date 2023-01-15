/*

 */
package com.portfolio.argprograma.Dto;

import java.sql.Date;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DtoProyecto {
    
    @NotBlank
    private String institucion;
    
    @NotBlank
    private String proyecto;
    
    @NotBlank
    private String profesion;
    
    @NotBlank
    private String logoproyecto;
    
    @NotBlank
    private String tema;
    
    @NotBlank
    private String temauno;
   
    @NotBlank
    private Date anio;
    
    @NotBlank
    private String estado;

    public DtoProyecto(String institucion, String proyecto, String profesion, String logoproyecto, String tema, String temauno, Date anio, String estado) {
        this.institucion = institucion;
        this.proyecto = proyecto;
        this.profesion = profesion;
        this.logoproyecto = logoproyecto;
        this.tema = tema;
        this.temauno = temauno;
        this.anio = anio;
        this.estado = estado;
    }
    
}
