/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.alchoholsoftwaredesignprinciples.PrincipleofLeastKnowledge.Correction;

/**
 *
 * @author Bradz
 */
public interface BeerInterface {
    public String getName();
    public String getType();
    public int getSize()  ;      
    public String getContainerType();
    public double getAlcPercent();
}
