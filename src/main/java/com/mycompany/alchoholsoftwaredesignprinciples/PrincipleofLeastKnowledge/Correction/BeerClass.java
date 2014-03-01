/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.alchoholsoftwaredesignprinciples.PrincipleofLeastKnowledge.Correction;

/**
 *
 * @author Bradz
 */
public class BeerClass extends AlchoholClass implements NewCorrectionInterface{
    
    NewCorrectionInterface nci;
    
    private String bName;
    private String bType;
    private int bSize;
    private String bContainerType;
    private double bAlcPercent;
    
    public BeerClass(){}
    
    public BeerClass(String bName,String bType,int bSize,String bContainerType,double bAlcPercent)
    {
        this.bName = bName;
        this.bType = bType;
        this.bSize = bSize;
        this.bContainerType = bContainerType;
        this.bAlcPercent = bAlcPercent;
    }
    
    @Override
    public void setName(String bName)
    {
        this.bName = bName;
    }
    
    public void setType(String bType)
    {
        this.bType = bType;
    }
    
    public void setSize(int bSize)
    {
        this.bSize = bSize;
    }
    
    public void setConType(String containerType)
    {
         this.bContainerType = bContainerType;
    }
    
    public void setAlcPercent(double alcPercent)
    {
        this.bAlcPercent = bAlcPercent;
    }
    
    public String getName()
    {
        return bName;
    }
    
    public String getType()
    {
        return bType;
    }
    
    public int getSize()
    {
        return bSize;
    }
    
    public String getContainerType()
    {
        return bContainerType;
    }
    
    public double getAlcPercent()
    {
        return bAlcPercent;
    }
    
    public String violationString()
    {
        return "This string method is from the beer class in correction package";
    }
}