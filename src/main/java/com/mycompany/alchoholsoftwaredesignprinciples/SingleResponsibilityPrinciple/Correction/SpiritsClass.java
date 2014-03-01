/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.alchoholsoftwaredesignprinciples.SingleResponsibilityPrinciple.Correction;



/**
 *
 * @author Bradz
 */
public class SpiritsClass extends AlcoholClass implements AlcoholInterface{
    
    private String sName = "Captain Morgan";
    private String sType;
    private int sSize;
    private String sContainerType;
    private double sAlcPercent;
    
    public SpiritsClass() {}
    
    public SpiritsClass(String sName,String sType,int sSize,String sContainerType,double sAlcPercent)
    {
        this.sName = sName;
        this.sType = sType;
        this.sSize = sSize;
        this.sContainerType = sContainerType;
        this.sAlcPercent = sAlcPercent;
    }
    
    @Override
    public void setName(String sName)
    {
        this.sName = sName;
    }
    
    public void setType(String sType)
    {
        this.sType = sType;
    }
    
    public void setSize(int sSize)
    {
        this.sSize = sSize;
    }
    
    public void setConType(String containerType)
    {
         this.sContainerType = containerType;
    }
    
    public void setAlcPercent(double alcPercent)
    {
        this.sAlcPercent = alcPercent;
    }
    
    public String getName()
    {
        return sName;
    }
    
    public String getType()
    {
        return sType;
    }
    
    public int getSize()
    {
        return sSize;
    }
    
    public String getContainerType()
    {
        return sContainerType;
    }
    
    public double getAlcPercent()
    {
        return sAlcPercent;
    
    }
    
}
