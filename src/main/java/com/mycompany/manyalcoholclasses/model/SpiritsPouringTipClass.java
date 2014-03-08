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
public class SpiritsPouringTipClass {
    private String id;
    private String spiritsType;
    private String spTip;
    private List<SpiritsClass> spiritsList;

    
    private SpiritsPouringTipClass(){}
    
    private SpiritsPouringTipClass(Builder builder){
         id = builder.id;
        spiritsType = builder.spiritsType;
        spTip = builder.spTip;
    }
    
    public static class Builder{
    private String id;
    private List<SpiritsClass> spiritsList;
    private String spiritsType;
    private String spTip;
    
    public Builder(String spTip){
        this.spTip = spTip;
    }
    
    public Builder id(String value){
        id = value;
        return this;
    }
    
    public Builder spirits(List<SpiritsClass> value){
        spiritsList = value;
        return this;
    }
    
    public SpiritsPouringTipClass build(){
        return new SpiritsPouringTipClass(this);
    }    
    }
    
    public String getId(){
        return id;
    }
    
    public String getSpiritsPourTip(){
        return spTip;
    }
    
    public List<SpiritsClass> getSpiritsList(){
        return spiritsList;
    }
    
    @Override
    public boolean equals(Object o){
        if(this == o) {
            return true;
        }
        if(o == null||getClass()!=o.getClass()) {
            return false;
        }
        
        SpiritsPouringTipClass spTip = (SpiritsPouringTipClass) o;
        
        if(!spTip.equals(spTip.spTip)) {
            return false;
        }
        
        return true;
    }
    
    @Override
    public int hashCode(){
        return spTip.hashCode();
    }
}
