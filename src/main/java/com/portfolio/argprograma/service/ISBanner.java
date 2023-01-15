/*

 */
package com.portfolio.argprograma.service;


import com.portfolio.argprograma.entity.Banner;
import java.util.List;


public interface ISBanner {
    public List<Banner> verBanner();
    public void crearBanner(Banner bann);
    public void borrarBanner(int id);
    public Banner buscarBanner(int id);  
    public void saveBanner(Banner bann);
    public boolean existById(int id);    
}
