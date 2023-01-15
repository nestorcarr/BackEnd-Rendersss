/*

 */
package com.portfolio.argprograma.service;

import com.portfolio.argprograma.entity.Laboral;
import java.util.List;


public interface ISLaboral {
    public List<Laboral> verTrabajos();
    public void crearTrabajo(Laboral lab);
    public void borrarTrabajo(int id);
    public Laboral buscarTrabajo(int id);  
    public void saveLaboral(Laboral traba);
    public boolean existById(int id);
}
