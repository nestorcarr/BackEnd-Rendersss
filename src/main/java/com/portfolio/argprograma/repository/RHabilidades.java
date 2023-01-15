/*

 */
package com.portfolio.argprograma.repository;

import com.portfolio.argprograma.entity.Habilidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RHabilidades extends JpaRepository<Habilidades, Integer>{
    
}
