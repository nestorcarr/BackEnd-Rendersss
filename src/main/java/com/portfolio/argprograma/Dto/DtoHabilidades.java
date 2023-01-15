/*

 */
package com.portfolio.argprograma.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DtoHabilidades {
    
    @NotBlank
    private String habilidad;
    
    @NotBlank
    private int porcentaje;
    
    @NotBlank
    private String color;

    public DtoHabilidades(String habilidad, int porcentaje, String color) {
        this.habilidad = habilidad;
        this.porcentaje = porcentaje;
        this.color = color;
    }
    
}
