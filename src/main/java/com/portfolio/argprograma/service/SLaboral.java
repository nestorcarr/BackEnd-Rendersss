/*

 */
package com.portfolio.argprograma.service;

import com.portfolio.argprograma.entity.Laboral;
import com.portfolio.argprograma.repository.RLaboral;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SLaboral implements ISLaboral{
    @Autowired
    RLaboral rLaboral;


    @Override
    public List<Laboral> verTrabajos(){
        List<Laboral> listaTrabajos = rLaboral.findAll();
        return listaTrabajos;
    }

    @Override
    public void crearTrabajo(Laboral lab) {
        rLaboral.save(lab);
    }

    @Override
    public void borrarTrabajo(int id) {
       rLaboral.deleteById(id);
    }

    @Override
    public Laboral buscarTrabajo(int id) {
        //acá si no encuentro la persona, devuelvo null por eso va el orElse
        Laboral traba = rLaboral.findById(id).orElse(null);
        return traba;
    }
    
    @Override
    public void saveLaboral(Laboral traba) {
       rLaboral.save(traba);
    }
    
    @Override

    public boolean existById(int id) {

        rLaboral.existsById(id);

        return true;

    }
}
