/*

 */
package com.portfolio.argprograma.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;





@Getter @Setter
@Entity
public class Banner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    @Size(min = 1, max = 140, message = "no cumple con la longitud")
    private String carouselimag;
    @NotNull
    @Size(min = 1, max = 140, message = "no cumple con la longitud")
    private String carouselimage;
    @NotNull
    @Size(min = 1, max = 140, message = "no cumple con la longitud")
    private String carouselimagen;
    @NotNull
    @Size(min = 1, max = 140, message = "no cumple con la longitud")
    private String imageprincipal;

    public Banner() {
    }

    public Banner(String carouselimag, String carouselimage, String carouselimagen, String imageprincipal) {
        this.carouselimag = carouselimag;
        this.carouselimage = carouselimage;
        this.carouselimagen = carouselimagen;
        this.imageprincipal = imageprincipal;
    }

   
    
}

