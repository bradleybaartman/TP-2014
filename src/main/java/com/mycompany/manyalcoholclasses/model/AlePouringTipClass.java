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
public class AlePouringTipClass {
    private String id;
    private String aleType;
    private String apTip;
    private List<AleClass> aleList;

    
    private AlePouringTipClass(){}
    
    private AlePouringTipClass(Builder builder){
        id = builder.id;
        aleType = builder.aleType;
        apTip = builder.apTip;
    }
    
    public static class Builder{
    private String id;
    private List<AleClass> aleList;
    private String aleType;
    private String apTip;
    
    public Builder(String apTip){
        this.apTip = apTip;
    }
    
    public Builder id(String value){
        id = value;
        return this;
    }
    
    public Builder ales(List<AleClass> value){
        aleList = value;
        return this;
    }
    
    public AlePouringTipClass build(){
        return new AlePouringTipClass(this);
    }    
    }
    
    public String getId(){
        return id;
    }
    
    public String getAlePourTip(){
        return apTip;
    }
    
    
    public List<AleClass> getAleList(){
        return aleList;
    }
    
    @Override
    public boolean equals(Object o){
        if(this == o) {
            return true;
        }
        if(o == null||getClass()!=o.getClass()) {
            return false;
        }
        
        AlePouringTipClass apTip= (AlePouringTipClass) o;
        
        if(!apTip.equals(apTip.id)) {
            return false;
        }
        
        return true;
    }
    
    @Override
    public int hashCode(){
        return aleType.hashCode();
    }
}
