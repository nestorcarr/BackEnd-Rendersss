/*

 */
package com.portfolio.argprograma.repository;

import com.portfolio.argprograma.entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;





@Repository
public interface RProyecto extends JpaRepository<Proyecto, Integer>{
    
}
