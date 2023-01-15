/*

 */
package com.portfolio.argprograma.service;

import com.portfolio.argprograma.entity.Habilidades;
import com.portfolio.argprograma.repository.RHabilidades;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional 
public class SHabilidades implements ISHabilidades{
    @Autowired
    RHabilidades rHabilidad;


    @Override
    public List<Habilidades> verHabilidad(){
        List<Habilidades> listaHabilidades = rHabilidad.findAll();
        return listaHabilidades;
    }

    @Override
    public void crearHabilidad(Habilidades habil) {
        rHabilidad.save(habil);
    }

    @Override
    public void borrarHabilidad(int id) {
       rHabilidad.deleteById(id);
    }

    @Override
    public Habilidades buscarHabilidad(int id) {
        //acá si no encuentro la habilidad, devuelvo null por eso va el orElse
        Habilidades habil = rHabilidad.findById(id).orElse(null);
        return habil;
    }
    @Override
    public void saveHabilidad(Habilidades habil) {
       rHabilidad.save(habil);
    }
    @Override
    public boolean existById(int id) {

        rHabilidad.existsById(id);

        return true;

    }
}
