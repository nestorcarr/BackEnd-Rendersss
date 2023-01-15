/*

 */
package com.portfolio.argprograma.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DtoPersona {
    
    @NotBlank
    private String nombre;
    
    @NotBlank
    private String apellido;
    
    @NotBlank
    private String profesion;
    
    @NotBlank
    private String acerca_de_mi;
    
    @NotBlank
    private String acercademi;
    
    @NotBlank
    private String imageprincipal;

    public DtoPersona(String nombre, String apellido, String profesion, String acerca_de_mi, String acercademi, String imageprincipal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.acerca_de_mi = acerca_de_mi;
        this.acercademi = acercademi;
        this.imageprincipal = imageprincipal;
    }
    
    
    
}
