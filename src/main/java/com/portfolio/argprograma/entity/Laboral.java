/*

 */
package com.portfolio.argprograma.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Lob;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter @Setter
@Entity
public class Laboral {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Size(min = 1, max = 600, message = "no cumple con la longitud")
    private String empresa;
    @NotNull
    @Size(min = 1, max = 1400, message = "no cumple con la longitud")
    private String logo;
    @NotNull
    @Size(min = 1, max = 400, message = "no cumple con la longitud")
    private String cargo;
    
    private String inicio;
    
    private String finalizacion;
    @NotNull
    @Lob
    @Column(length=2000)
    private String tareas;

    public Laboral() {
    }

    public Laboral(String empresa, String logo, String cargo, String inicio, String finalizacion, String tareas) {
        this.empresa = empresa;
        this.logo = logo;
        this.cargo = cargo;
        this.inicio = inicio;
        this.finalizacion = finalizacion;
        this.tareas = tareas;
    }

    

    

    
}

