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
public class CiderPouringTipClass {
    private String id;
    private String ciderType;
    private String cpTip;
    private List<CiderClass> ciderList;

    
    private CiderPouringTipClass(){}
    
    private CiderPouringTipClass(Builder builder){
        id = builder.id;
        ciderType = builder.ciderType;
        cpTip = builder.cpTip;
    }
    
    public static class Builder{
    private String id;
    private List<CiderClass> ciderList;
    private String ciderType;
    private String cpTip;
    
    public Builder(String apTip){
        this.cpTip = cpTip;
    }
    
    public Builder id(String value){
        id = value;
        return this;
    }
    
    public Builder ciders(List<CiderClass> value){
        ciderList = value;
        return this;
    }
    
    public CiderPouringTipClass build(){
        return new CiderPouringTipClass(this);
    }    
    }
    
    public String getId(){
        return id;
    }
    
    public String getCiderPourTip(){
        return cpTip;
    }
    
    public List<CiderClass> getCiderList(){
        return ciderList;
    }
    
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null||getClass()!=o.getClass()) return false;
        
        CiderPouringTipClass cpTip = (CiderPouringTipClass) o;
        
        if(!cpTip.equals(cpTip.cpTip))return false;
        
        return true;
    }
    
    public int hashCode(){
        return cpTip.hashCode();
    }
}
