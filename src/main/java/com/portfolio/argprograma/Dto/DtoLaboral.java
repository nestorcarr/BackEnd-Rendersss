/*

 */
package com.portfolio.argprograma.Dto;

import java.sql.Date;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DtoLaboral {
    
    @NotBlank
    private String empresa;
    
    @NotBlank
    private String logo;
    
    @NotBlank
    private String cargo;
    
    private Date inicio;
    
    private Date finalizacion;
    
    @NotBlank
    private String tareas;
    
    public DtoLaboral(String empresa, String logo, String cargo, Date inicio, Date finalizacion, String tareas) {
        this.empresa = empresa;
        this.logo = logo;
        this.cargo = cargo;
        this.inicio = inicio;
        this.finalizacion = finalizacion;
        this.tareas = tareas;
    }
    
}
