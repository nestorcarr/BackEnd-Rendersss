/*

 */
package com.portfolio.argprograma.service;

import com.portfolio.argprograma.entity.Proyecto;
import java.util.List;


public interface ISProyecto {
    public List<Proyecto> verProyecto();
    public void crearProyecto(Proyecto proye);
    public void borrarProyecto(int id);
    public Proyecto buscarProyecto(int id);
    public void saveProyecto(Proyecto proye);
    public boolean existById(int id);
}
