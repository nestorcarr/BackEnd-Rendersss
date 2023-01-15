package com.portfolio.argprograma.controller;

import com.portfolio.argprograma.entity.Persona;
import com.portfolio.argprograma.service.SPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("persona")
public class CPersona {
    @Autowired
    private SPersona persoServ;

    @GetMapping ("/ver")
    @ResponseBody
    public List<Persona> verPersonas(){
        return persoServ.verPersonas();
    }

    @PostMapping ("/new")
    public String agregarPersona (@RequestBody Persona perso){
        persoServ.crearPersona(perso);
        return "La persona fue creada correctamente";
    }

    @PostMapping ("/delete/{id}")
    public String eliminarPersona(@PathVariable int id){
        persoServ.borrarPersona(id);
        return "La persona fue borrada correctamente";
    }
    
    @PostMapping ("/editar/{id}")
    public Persona editPersona(@PathVariable int id, 
            @RequestBody Persona perso){
            persoServ.savePersona(perso);
            return perso;
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Persona> getById(@PathVariable int id) {
        if (persoServ.existById(id)) {
            Persona persona = persoServ.buscarPersona(id); //getOne
            return new ResponseEntity(persona, HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
 
    }

    
}
