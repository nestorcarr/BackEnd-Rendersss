/*

 */
package com.portfolio.argprograma.repository;

import com.portfolio.argprograma.entity.Persona;
//import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPersona extends JpaRepository<Persona, Integer>{
    //public Optional<Persona>FindByNombre(String nombre);
    //public boolean existsByNombre(String nombre);

   
}
