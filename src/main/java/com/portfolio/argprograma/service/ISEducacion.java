/*

 */
package com.portfolio.argprograma.service;

import com.portfolio.argprograma.entity.Educacion;
import java.util.List;


public interface ISEducacion {
    public List<Educacion> verEducacion();
    public void crearEducacion(Educacion educa);
    public void borrarEducacion(int id);
    public Educacion buscarEducacion(int id);
    public void saveEducacion(Educacion educa);
    public boolean existById(int id);    
}
