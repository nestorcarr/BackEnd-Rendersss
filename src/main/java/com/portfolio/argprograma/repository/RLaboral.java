/*

 */
package com.portfolio.argprograma.repository;


import com.portfolio.argprograma.entity.Laboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RLaboral extends JpaRepository<Laboral, Integer>{
    
}
