/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.alchoholsoftwaredesignprinciples.SingleResponsibilityPrinciple.Correction;

/**
 *
 * @author Bradz
 */
public class AlcoholClass {
    
    private String beverageName;
    
    public AlcoholClass(){}
    
    public AlcoholClass(String beverageName)
    {
        this.beverageName = beverageName;
    }
    
    public void setName(String beverageName)
    {
        this.beverageName = beverageName;
    }
    
    public String getName()
    {
        return beverageName;
    }
}
