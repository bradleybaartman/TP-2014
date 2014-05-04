/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.domainrepository.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Bradz
 */
@Entity
public class Ale implements Serializable{
    private static final long serialVerionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    @Column(unique = true)
    private int aCode;
    private String aName;    
    private String aType;
    private int aSize;
    private String aContainerType;
    private double aAlcPercent;
   
    private Ale(Builder builder) {
        aCode = builder.aCode;
        aName = builder.aName;
        aType = builder.aType;
        aSize = builder.aSize;
        aContainerType = builder.aContainerType;
        aAlcPercent = builder.aAlcPercent;
        }
    
    public Ale(){}
    
    public static class Builder{
        private int aCode;
        private String aName;
        private String aType;
        private int aSize;
        private String aContainerType;
        private double aAlcPercent;
        
        public Builder(int bCode){
            this.aCode = aCode;
        }
        
        public Builder aCode(int value)
        {
            aCode = value;
            return this;
        }
        
        public Builder aName(String value){
            this.aName = value;
            return this;
        }
        
        public Builder aType(String value){
            this.aType = value;
            return this;
        }
        
        public Builder aSize(int value){
            this.aSize = value;
            return this;
        }
        
        public Builder aContainerType(String value){
            this.aContainerType = value;
            return this;
        }
        
        public Builder aAlcPercent(double value){
            this.aAlcPercent = value;
            return this;
        }
        public Builder ale(Ale ale){
            aCode = ale.getCode();
            aName = ale.getName();
            aType = ale.getType();
            aSize = ale.getSize();
            aContainerType = ale.getConType();
            aAlcPercent = ale.getAlcPerc();
            return this;
        }
        
        public Ale build(){
            return new Ale(this);
        }
        
    }
    
    public int getCode(){
        return aCode;
    }
       
    public String getName(){
        return aName;
    }
    
    public String getType(){
        return aType;
    }
    
    public int getSize(){
        return aSize;
    }
    
    public String getConType(){
        return aContainerType;
    }
    
    public double getAlcPerc(){
        return aAlcPercent;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aName != null ? aName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ale)) {
            return false;
        }
        Ale other = (Ale) object;
        if ((this.aName == null && other.aName != null) || (this.aName != null && !this.aName.equals(other.aName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bradz.Ale class[ Ale code =" + aCode + " ]";
    }
    
}
        
        