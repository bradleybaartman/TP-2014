/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.manyalcoholclasses.config;

import com.mycompany.manyalcoholclasses.service.crud.BeerPouringTipCrudService;
import com.mycompany.manyalcoholclasses.service.crud.Impl.BeerPouringTipCrudServiceImpl;

import org.springframework.context.annotation.Bean;
/**
 *
 * @author Bradz
 */
public class AppConfig {
     @Bean(name = "beerPouringTipClassCrudService")   
    public BeerPouringTipCrudService getBeerPouringTipClassCrudService()
    {
        return new BeerPouringTipCrudServiceImpl();
    }
    
    /**
     *
     * @return
     */
    
}