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
public class Champagne implements Serializable{
    private static final long serialVerionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    @Column(unique = true)
    private int chCode;
    private String chName;    
    private String chType;
    private int chSize;
    private String chContainerType;
    private double chAlcPercent;
   
    private Champagne(Builder builder) {
        chCode = builder.chCode;
        chName = builder.chName;
        chType = builder.chType;
        chSize = builder.chSize;
        chContainerType = builder.chContainerType;
        chAlcPercent = builder.chAlcPercent;
        }
    
    public Champagne(){}
    
    public static class Builder{
        private int chCode;
        private String chName;
        private String chType;
        private int chSize;
        private String chContainerType;
        private double chAlcPercent;
        
        public Builder(int chCode){
            this.chCode = chCode;
        }
        
        public Builder chCode(int value)
        {
            chCode = value;
            return this;
        }
        
        public Builder chName(String value){
            this.chName = value;
            return this;
        }
        
        public Builder chType(String value){
            this.chType = value;
            return this;
        }
        
        public Builder chSize(int value){
            this.chSize = value;
            return this;
        }
        
        public Builder chContainerType(String value){
            this.chContainerType = value;
            return this;
        }
        
        public Builder chAlcPercent(double value){
            this.chAlcPercent = value;
            return this;
        }
        public Builder champagne(Champagne champagne){
            chCode = champagne.getCode();
            chName = champagne.getName();
            chType = champagne.getType();
            chSize = champagne.getSize();
            chContainerType = champagne.getConType();
            chAlcPercent = champagne.getAlcPerc();
            return this;
        }
        
        public Champagne build(){
            return new Champagne(this);
        }
        
    }
    
    public int getCode(){
        return chCode;
    }
       
    public String getName(){
        return chName;
    }
    
    public String getType(){
        return chType;
    }
    
    public int getSize(){
        return chSize;
    }
    
    public String getConType(){
        return chContainerType;
    }
    
    public double getAlcPerc(){
        return chAlcPercent;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (chName != null ? chName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Champagne)) {
            return false;
        }
        Champagne other = (Champagne) object;
        if ((this.chName == null && other.chName != null) || (this.chName != null && !this.chName.equals(other.chName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bradz.Champagne class[ Champagne code =" + chCode + " ]";
    }
    
}
        
        