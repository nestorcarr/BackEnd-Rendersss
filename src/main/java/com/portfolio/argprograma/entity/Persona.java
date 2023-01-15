/*
******************
 */
package com.portfolio.argprograma.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Lob;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Id;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellido;
    private String profesion;
    @Lob
    @Column(length=2000)
    private String acerca_de_mi;
    @Lob
    private String acercademi;
    private String imageprincipal;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String profesion, String acerca_de_mi, String acercademi, String imageprincipal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.acerca_de_mi = acerca_de_mi;
        this.acercademi = acercademi;
        this.imageprincipal = imageprincipal;
    }
 
}
