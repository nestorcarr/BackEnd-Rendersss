/*

 */
package com.portfolio.argprograma.service;

import com.portfolio.argprograma.entity.Persona;
import java.util.List;


public interface ISPersona {
    public List<Persona> verPersonas();
    public void crearPersona(Persona per);
    public void borrarPersona(int id);
    public Persona buscarPersona(int id);
    public void savePersona(Persona perso);
    public boolean existById(int id);
}
