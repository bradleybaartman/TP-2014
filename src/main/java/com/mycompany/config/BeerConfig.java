/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.config;


import com.mycompany.alchoholsoftwaredesignprinciples.PrincipleofLeastKnowledge.Correction.BeerClass;
import com.mycompany.alchoholsoftwaredesignprinciples.PrincipleofLeastKnowledge.Correction.BeerInterface;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author Bradz
 */
public class BeerConfig {
    
    /**
     *
     * @return
     */
    @Bean(name = "beer1")
   
    public BeerClass getMyClass()
    {
        return new BeerClass();
    }
    
}
