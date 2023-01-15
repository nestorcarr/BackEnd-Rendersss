/*

 */
package com.portfolio.argprograma.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DtoEducacion {
    
    @NotBlank
    private String universidad;
    
    @NotBlank
    private String logo;
    
    @NotBlank
    private String titulo;
    
    @NotBlank
    private String institucion;
    
    @NotBlank
    private String estado;
    
    public DtoEducacion(String universidad, String logo, String titulo, String institucion, String estado ) {
        this.universidad = universidad;
        this.logo = logo;
        this.titulo = titulo;
        this.institucion = institucion;
        this.estado = estado;
    }
    
}
