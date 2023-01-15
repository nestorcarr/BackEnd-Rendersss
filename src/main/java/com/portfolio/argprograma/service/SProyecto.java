/*

 */
package com.portfolio.argprograma.service;

import com.portfolio.argprograma.entity.Proyecto;
import com.portfolio.argprograma.repository.RProyecto;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class SProyecto implements ISProyecto{
    @Autowired
    RProyecto rProyecto;


    @Override
    public List<Proyecto> verProyecto(){
        List<Proyecto> listaProyectos = rProyecto.findAll();
        return listaProyectos;
    }

    @Override
    public void crearProyecto(Proyecto proye) {
        rProyecto.save(proye);
    }

    @Override
    public void borrarProyecto(int id) {
       rProyecto.deleteById(id);
    }

    @Override
    public Proyecto buscarProyecto(int id) {
        //acá si no encuentro el proyecto, devuelvo null por eso va el orElse
        Proyecto proye = rProyecto.findById(id).orElse(null);
        return proye;
    }
    
    @Override
    public void saveProyecto(Proyecto proye) {
       rProyecto.save(proye);
    }
    
    @Override
    public boolean existById(int id) {

        rProyecto.existsById(id);

        return true;

    }
}
