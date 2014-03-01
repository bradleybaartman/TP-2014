/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.alchoholsoftwaredesignprinciples.LiskovSubsitutionPrinciple.Violation;

/**
 *
 * @author Bradz
 */
public class AlchoholClass {
    
    private String beverageName;
    
    public AlchoholClass(){}
    
    public AlchoholClass(String beverageName)
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
