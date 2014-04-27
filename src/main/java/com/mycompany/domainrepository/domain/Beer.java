/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.domainrepository.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Bradz
 */
@Entity
public class Beer implements Serializable{
    private static final long serialVerionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private String bName;
    private String bType;
    private int bSize;
    private String bContainerType;
    private double bAlcPercent;
   
    private Beer(Builder builder) {
        bName = builder.bName;
        bType = builder.bType;
        bSize = builder.bSize;
        bContainerType = builder.bContainerType;
        bAlcPercent = builder.bAlcPercent;
        }
    
    public Beer(){}
    
    public static class Builder{
        private String bName;
        private String bType;
        private int bSize;
        private String bContainerType;
        private double bAlcPercent;
        
        public Builder(String bName){
            this.bName = bName;
        }
        
        public Builder bType(String value){
            this.bType = value;
            return this;
        }
        
        public Builder bSize(int value){
            this.bSize = value;
            return this;
        }
        
        public Builder bContainerType(String value){
            this.bContainerType = value;
            return this;
        }
        
        public Builder bAlcPercent(double value){
            this.bAlcPercent = value;
            return this;
        }
        public Builder beer(Beer beer){
            bName = beer.getName();
            bType = beer.getType();
            bSize = beer.getSize();
            bContainerType = beer.getConType();
            bAlcPercent = beer.getAlcPerc();
            return this;
        }
        
        public Beer build(){
            return new Beer(this);
        }
        
    }
       
    public String getName(){
        return bName;
    }
    
    public String getType(){
        return bType;
    }
    
    public int getSize(){
        return bSize;
    }
    
    public String getConType(){
        return bContainerType;
    }
    
    public double getAlcPerc(){
        return bAlcPercent;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bName != null ? bName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Beer)) {
            return false;
        }
        Beer other = (Beer) object;
        if ((this.bName == null && other.bName != null) || (this.bName != null && !this.bName.equals(other.bName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bradz.Beer class[ Beer name =" + bName + " ]";
    }
    
}
        
        