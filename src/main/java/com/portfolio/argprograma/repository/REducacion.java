/*

 */
package com.portfolio.argprograma.repository;


import com.portfolio.argprograma.entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REducacion extends JpaRepository<Educacion, Integer>{
    
}
