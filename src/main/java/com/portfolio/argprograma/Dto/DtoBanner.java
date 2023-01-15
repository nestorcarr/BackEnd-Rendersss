/*

 */
package com.portfolio.argprograma.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DtoBanner {
    
    @NotBlank
    private String carouselimag;
    
    @NotBlank
    private String carouselimage;
    
    @NotBlank
    private String carouselimagen;
    
    @NotBlank
   private String imageprincipal;
    
     public DtoBanner(String carouselimag, String carouselimage, String carouselimagen, String imageprincipal) {
        this.carouselimag = carouselimag;
        this.carouselimage = carouselimage;
        this.carouselimagen = carouselimagen;
        this.imageprincipal = imageprincipal;
    }
    
    
}
