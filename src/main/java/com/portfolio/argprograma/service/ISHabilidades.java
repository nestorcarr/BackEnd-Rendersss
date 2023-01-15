/*

 */
package com.portfolio.argprograma.service;

import com.portfolio.argprograma.entity.Habilidades;
import java.util.List;


public interface ISHabilidades {
    public List<Habilidades> verHabilidad();
    public void crearHabilidad(Habilidades habil);
    public void borrarHabilidad(int id);
    public Habilidades buscarHabilidad(int id);
    public void saveHabilidad(Habilidades habil);
    public boolean existById(int id);
}
