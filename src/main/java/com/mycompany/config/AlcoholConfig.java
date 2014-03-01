/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.config;


import com.mycompany.alchoholsoftwaredesignprinciples.PrincipleofLeastKnowledge.Correction.BeerClass;
import com.mycompany.alchoholsoftwaredesignprinciples.SingleResponsibilityPrinciple.Correction.SpiritsClass;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author Bradz
 */
public class AlcoholConfig {
    
    /**
     *
     * @return
     */
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
    
}
