/*

 */
package com.portfolio.argprograma.service;

import com.portfolio.argprograma.entity.Banner;
import com.portfolio.argprograma.repository.RBanner;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SBanner implements ISBanner{
    @Autowired
    RBanner rBanner;


    @Override
    public List<Banner> verBanner(){
        List<Banner> listaBanner = rBanner.findAll();
        return listaBanner;
    }

    @Override
    public void crearBanner(Banner bann) {
        rBanner.save(bann);
    }

    @Override
    public void borrarBanner(int id) {
       rBanner.deleteById(id);
    }

    @Override
    public Banner buscarBanner(int id) {
        //acá si no encuentro la educacion, devuelvo null por eso va el orElse
        Banner bann = rBanner.findById(id).orElse(null);
        return bann;
    }
    
    @Override
    public void saveBanner(Banner bann) {
       rBanner.save(bann);
    }
    
    @Override

    public boolean existById(int id) {

        rBanner.existsById(id);

        return true;

    }
}
