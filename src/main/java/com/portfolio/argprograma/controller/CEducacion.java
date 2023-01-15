/*

 */
package com.portfolio.argprograma.controller;

import com.portfolio.argprograma.entity.Educacion;
import com.portfolio.argprograma.service.SEducacion;
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
@RequestMapping("educacion")
public class CEducacion {
    @Autowired
    private SEducacion educaServ;

    @GetMapping ("/ver")
    @ResponseBody
    public List<Educacion> verEducacion(){
        return educaServ.verEducacion();
    }

    @PostMapping ("/new")
    public String agregarEducacion (@RequestBody Educacion educa){
        educaServ.crearEducacion(educa);
        return "La educacion fue creada correctamente";
    }

    @PostMapping ("/delete/{id}")
    public String eliminarEducacion(@PathVariable int id){
        educaServ.borrarEducacion(id);
        return "La educacion fue borrada correctamente";
    }
    
    @PostMapping ("/editar/{id}")
    public Educacion editEducacion(@PathVariable int id, @RequestBody Educacion educa){
    educaServ.saveEducacion(educa);
       return educa;
    }

   
    @GetMapping("/detail/{id}")
    public ResponseEntity<Educacion> getById(@PathVariable int id) {
        if (educaServ.existById(id)) {
            Educacion educacion = educaServ.buscarEducacion(id); //getOne
            return new ResponseEntity(educacion, HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
 
    }
}
