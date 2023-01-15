package com.portfolio.argprograma.controller;

import com.portfolio.argprograma.entity.Laboral;
import com.portfolio.argprograma.service.SLaboral;
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
@RequestMapping("laboral")
public class CLaboral {
    @Autowired
    SLaboral trabaServ;

    @GetMapping ("/ver")
    @ResponseBody
    public List<Laboral> verTrabajos(){
        return trabaServ.verTrabajos();
    }

    @PostMapping ("/new")
    public String agregarTrabajo (@RequestBody Laboral traba){
        trabaServ.crearTrabajo(traba);
        return "El trabajo fue creado correctamente";
    }

    @PostMapping ("/delete/{id}")
    public String eliminarTrabajo(@PathVariable int id){
        trabaServ.borrarTrabajo(id);
        return "El trabajo fue borrado correctamente";
    }
    
    @PostMapping ("/editar/{id}")
    public Laboral editLaboral(@PathVariable int id, @RequestBody Laboral traba){
    trabaServ.saveLaboral(traba);
       return traba;
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Laboral> getById(@PathVariable int id) {
        if (trabaServ.existById(id)) {
            Laboral laboral = trabaServ.buscarTrabajo(id); //getOne
            return new ResponseEntity(laboral, HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
 
    }
    
}
