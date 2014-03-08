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
public class LiquerPouringTipClass {
    private String id;
    private String liquerType;
    private String lpTip;
    private List<LiquerClass> liquerList;

    
    private LiquerPouringTipClass(){}
    
    private LiquerPouringTipClass(Builder builder){
        id = builder.id;
        liquerType = builder.liquerType;
        lpTip = builder.lpTip;
    }
    
    public static class Builder{
    private String id;
    private List<LiquerClass> liquerList;
    private String liquerType;
    private String lpTip;
    
    public Builder(String lpTip){
        this.lpTip = lpTip;
    }
    
    public Builder id(String value){
        id = value;
        return this;
    }
    
    public Builder ciders(List<LiquerClass> value){
        liquerList = value;
        return this;
    }
    
    public LiquerPouringTipClass build(){
        return new LiquerPouringTipClass(this);
    }    
    }
    
    public String getId(){
        return id;
    }
    
    public String getLiquerPourTip(){
        return lpTip;
    }
    
    public List<LiquerClass> getLiquerList(){
        return liquerList;
    }
    
    @Override
    public boolean equals(Object o){
        if(this == o) {
            return true;
        }
        if(o == null||getClass()!=o.getClass()) {
            return false;
        }
        
        LiquerPouringTipClass lpTip = (LiquerPouringTipClass) o;
        
        if(!lpTip.equals(lpTip.lpTip)) {
            return false;
        }
        
        return true;
    }
    
    @Override
    public int hashCode(){
        return lpTip.hashCode();
    }
}
