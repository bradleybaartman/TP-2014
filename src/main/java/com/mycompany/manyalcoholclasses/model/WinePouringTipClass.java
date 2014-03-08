/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.manyalcoholclasses.model;

import java.util.List;
/**
 *
 * @author Bradz
 */
public class WinePouringTipClass {
    private String id;
    private String wineType;
    private String wpTip;
    private List<WineClass> wineList;

    
    private WinePouringTipClass(){}
    
    private WinePouringTipClass(Builder builder){
        id = builder.id;
        wineType = builder.wineType;
        wpTip = builder.wpTip;
    }
    
    public static class Builder{
    private String id;
    private List<WineClass> wineList;
    private String wineType;
    private String wpTip;
    
    public Builder(String wpTip){
        this.wpTip = wpTip;
    }
    
    public Builder id(String value){
        id = value;
        return this;
    }
    
    public Builder wines(List<WineClass> value){
        wineList = value;
        return this;
    }
    
    public WinePouringTipClass build(){
        return new WinePouringTipClass(this);
    }    
    }
    
    public String getId(){
        return id;
    }
    
    public String getWinePourTip(){
        return wpTip;
    }
    
    public List<WineClass> getWineList(){
        return wineList;
    }
    
    @Override
    public boolean equals(Object o){
        if(this == o) {
            return true;
        }
        if(o == null||getClass()!=o.getClass()) {
            return false;
        }
        
        WinePouringTipClass wpTip = (WinePouringTipClass) o;
        
        if(!wpTip.equals(wpTip.wpTip)) {
            return false;
        }
        
        return true;
    }
    
    @Override
    public int hashCode(){
        return wpTip.hashCode();
    }
}