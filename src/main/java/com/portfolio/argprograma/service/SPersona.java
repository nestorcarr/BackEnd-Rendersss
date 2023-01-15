/*
@Service
@Transactional
@Autowired
Y se desarrollan los metodos crud y opcionales
*/
package com.portfolio.argprograma.service;

import com.portfolio.argprograma.entity.Persona;
import com.portfolio.argprograma.repository.RPersona;
import java.util.List;
import javax.transaction.Transactional;
//import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SPersona implements ISPersona{
    @Autowired
    RPersona rPersona;


    @Override
    public List<Persona> verPersonas(){
        List<Persona> listaPersonas = rPersona.findAll();
        return listaPersonas;
    }

    @Override
    public void crearPersona(Persona per) {
        rPersona.save(per);
    }
  
    @Override
    public void borrarPersona(int id) {
       rPersona.deleteById(id);
    }

    @Override
    public Persona buscarPersona(int id) {
        //acá si no encuentro la persona, devuelvo null por eso va el orElse
        Persona perso = rPersona.findById(id).orElse(null);
        return perso;
    }

    /*
    @Override
    public Optional<Persona> getOne(Long id){
        return rPersona.findById(id);
    }*/
    @Override
    public void savePersona(Persona perso) {
       rPersona.save(perso);
    }
    
    @Override

    public boolean existById(int id) {

        rPersona.existsById(id);

        return true;

    }
    

}
