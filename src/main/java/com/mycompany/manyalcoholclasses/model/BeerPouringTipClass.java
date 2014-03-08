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
public class BeerPouringTipClass {
    private String id;
    private String beerType;
    private String bpTip;
    private List<BeerClass> beerList;

    
    private BeerPouringTipClass(){}
    
    private BeerPouringTipClass(Builder builder){
        id = builder.id;
        beerType = builder.beerType;
        bpTip = builder.bpTip;
    }
    
    public static class Builder{
    private String id;
    private List<BeerClass> beerList;
    private String beerType;
    private String bpTip;
    
    public Builder(String bpTip){
        this.bpTip = bpTip;
    }
    
    public Builder id(String value){
        id = value;
        return this;
    }
    
    public Builder beers(List<BeerClass> value){
        beerList = value;
        return this;
    }
    
    public BeerPouringTipClass build(){
        return new BeerPouringTipClass(this);
    }    
    }
    
    public String getId(){
        return id;
    }
    
    public String getBeerPourTip(){
        return bpTip;
    }
    
    public List<BeerClass> getBeerList(){
        return beerList;
    }
    
    @Override
    public boolean equals(Object o){
        if(this == o) {
            return true;
        }
        if(o == null||getClass()!=o.getClass()) {
            return false;
        }
        
        BeerPouringTipClass bpTip = (BeerPouringTipClass) o;
        
        if(!bpTip.equals(bpTip.bpTip)) {
            return false;
        }
        
        return true;
    }
    
    @Override
    public int hashCode(){
        return bpTip.hashCode();
    }
}
