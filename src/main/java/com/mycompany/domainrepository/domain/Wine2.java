/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.domainrepository.domain;

/**
 *
 * @author Bradz
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
public class Wine2  implements Serializable{
    private static final long serialVerionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    @Column(unique = true)
    private int wCode;
    private String wFarmName;    
    private String wType;
    private int wYear;
    private int wSize;
    private String wContainerType;
    private double wAlcPercent;
   
    private Wine2(Builder builder) {
        wCode = builder.wCode;
        wFarmName = builder.wFarmName;
        wType = builder.wType;
        wYear = builder.wYear;
        wSize = builder.wSize;
        wContainerType = builder.wContainerType;
        wAlcPercent = builder.wAlcPercent;
        }
    
    public Wine2(){}
    
    public static class Builder{
        private int wCode;
        private String wFarmName;
        private String wType;
        private int wYear;
        private int wSize;
        private String wContainerType;
        private double wAlcPercent;
        
        public Builder(int wCode){
            this.wCode = wCode;
        }
        
        public Builder wCode(int value)
        {
            wCode = value;
            return this;
        }
        
        public Builder wFarmName(String value){
            this.wFarmName = value;
            return this;
        }
        
        public Builder wType(String value){
            this.wType = value;
            return this;
        }
        public Builder wYear(int value){
        
            this.wYear = value;
            return this;
        }
        
        public Builder wSize(int value){
            this.wSize = value;
            return this;
        }
        
        public Builder wContainerType(String value){
            this.wContainerType = value;
            return this;
        }
        
        public Builder wAlcPercent(double value){
            this.wAlcPercent = value;
            return this;
        }
        public Builder wine(Wine2 wine){
            wCode = wine.getCode();
            wFarmName = wine.getFarmName();
            wType = wine.getType();
            wYear = wine.getYear();
            wSize = wine.getSize();
            wContainerType = wine.getConType();
            wAlcPercent = wine.getAlcPerc();
            return this;
        }
        
        public Wine2 build(){
            return new Wine2(this);
        }
        
    }
   
    public int getCode(){
        return wCode;
    }
       
    public String getFarmName(){
        return wFarmName;
    }
    
    public String getType(){
        return wType;
    }
    
    public int getYear(){
        return wYear;
    }
    
    public int getSize(){
        return wSize;
    }
    
    public String getConType(){
        return wContainerType;
    }
    
    public double getAlcPerc(){
        return wAlcPercent;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (wFarmName != null ? wFarmName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Wine2)) {
            return false;
        }
        Wine2 other = (Wine2) object;
        if ((this.wFarmName == null && other.wFarmName != null) || (this.wFarmName != null && !this.wFarmName.equals(other.wFarmName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bradz.Wine2 class[ Wine2 code =" + wCode + " ]";
    }
     
    
}

