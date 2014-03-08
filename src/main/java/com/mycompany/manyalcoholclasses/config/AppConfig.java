/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.manyalcoholclasses.config;

import com.mycompany.manyalcoholclasses.model.AleClass;
import com.mycompany.manyalcoholclasses.model.BeerClass;
import com.mycompany.manyalcoholclasses.model.CiderClass;
import com.mycompany.manyalcoholclasses.model.LiquerClass;
import com.mycompany.manyalcoholclasses.model.SpiritsClass;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author Bradz
 */
public class AppConfig {
     @Bean(name = "alcoholBean")   
    public BeerClass getMyClass()
    {
        return new BeerClass();
    }
    
    /**
     *
     * @return
     */
    @Bean(name = "spiritsBean") 
    public SpiritsClass getSpiritsClass()
    {
        return new SpiritsClass();
    }
    
     @Bean(name = "AleBean") 
    public AleClass getAleClass()
    {
        return new AleClass();
    }
     
     @Bean(name = "ciderBean") 
    public CiderClass getCiderClass()
    {
        return new CiderClass();
    }
     
      @Bean(name = "liquerBean") 
    public LiquerClass getLiquerClass()
    {
        return new LiquerClass();
    }
    
}
