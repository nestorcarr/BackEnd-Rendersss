/*

 */
package com.portfolio.argprograma.service;

import com.portfolio.argprograma.entity.Educacion;
import com.portfolio.argprograma.repository.REducacion;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEducacion implements ISEducacion {
    @Autowired
    REducacion rEducacion;


    @Override
    public List<Educacion> verEducacion(){
        List<Educacion> listaEducacion = rEducacion.findAll();
        return listaEducacion;
    }

    @Override
    public void crearEducacion(Educacion educa) {
        rEducacion.save(educa);
    }

    @Override
    public void borrarEducacion(int id) {
       rEducacion.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(int id) {
        //acá si no encuentro la educacion, devuelvo null por eso va el orElse
        Educacion educa = rEducacion.findById(id).orElse(null);
        return educa;
    }
    @Override
    public void saveEducacion(Educacion educa) {
       rEducacion.save(educa);
    }
    
    @Override

    public boolean existById(int id) {

        rEducacion.existsById(id);

        return true;

    }
}
