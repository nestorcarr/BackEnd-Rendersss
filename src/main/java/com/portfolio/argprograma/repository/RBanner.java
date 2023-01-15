/*

 */
package com.portfolio.argprograma.repository;


import com.portfolio.argprograma.entity.Banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RBanner extends JpaRepository<Banner, Integer> {
    
}
