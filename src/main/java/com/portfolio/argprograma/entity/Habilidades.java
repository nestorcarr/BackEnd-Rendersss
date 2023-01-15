/*

 */
package com.portfolio.argprograma.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Id;


@Getter @Setter
@Entity
public class Habilidades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Size(min = 1, max = 20, message = "no cumple con la longitud")
    private String habilidad;
    @Min(0)
    @Max(100)
    private int porcentaje;
    @NotNull
    @Size(min = 1, max = 10, message = "no cumple con la longitud")
    private String color;

    public Habilidades() {
    }

    public Habilidades(String habilidad, int porcentaje, String color) {
        this.habilidad = habilidad;
        this.porcentaje = porcentaje;
        this.color = color;
    }

    
    
    
}
