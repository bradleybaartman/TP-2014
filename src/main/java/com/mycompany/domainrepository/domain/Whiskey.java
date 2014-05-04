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
public class Whiskey implements Serializable{
    private static final long serialVerionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    @Column(unique = true)
    private int whCode;
    private String whName;    
    private String whType;
    private int whSize;
    private String whContainerType;
    private double whAlcPercent;
   
    private Whiskey(Builder builder) {
        whCode = builder.whCode;
        whName = builder.whName;
        whType = builder.whType;
        whSize = builder.whSize;
        whContainerType = builder.whContainerType;
        whAlcPercent = builder.whAlcPercent;
        }
    
    public Whiskey(){}
    
    public static class Builder{
        private int whCode;
        private String whName;
        private String whType;
        private int whSize;
        private String whContainerType;
        private double whAlcPercent;
        
        public Builder(int whCode){
            this.whCode = whCode;
        }
        
        public Builder whCode(int value)
        {
            whCode = value;
            return this;
        }
        
        public Builder whName(String value){
            this.whName = value;
            return this;
        }
        
        public Builder whType(String value){
            this.whType = value;
            return this;
        }
        
        public Builder whSize(int value){
            this.whSize = value;
            return this;
        }
        
        public Builder whContainerType(String value){
            this.whContainerType = value;
            return this;
        }
        
        public Builder whAlcPercent(double value){
            this.whAlcPercent = value;
            return this;
        }
        public Builder whiskey(Whiskey whiskey){
            whCode = whiskey.getCode();
            whName = whiskey.getName();
            whType = whiskey.getType();
            whSize = whiskey.getSize();
            whContainerType = whiskey.getConType();
            whAlcPercent = whiskey.getAlcPerc();
            return this;
        }
        
        public Whiskey build(){
            return new Whiskey(this);
        }
        
    }
    
    public int getCode(){
        return whCode;
    }
       
    public String getName(){
        return whName;
    }
    
    public String getType(){
        return whType;
    }
    
    public int getSize(){
        return whSize;
    }
    
    public String getConType(){
        return whContainerType;
    }
    
    public double getAlcPerc(){
        return whAlcPercent;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (whName != null ? whName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Whiskey)) {
            return false;
        }
        Whiskey other = (Whiskey) object;
        if ((this.whName == null && other.whName != null) || (this.whName != null && !this.whName.equals(other.whName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bradz.Whiskey class[ Whiskey code =" + whCode + " ]";
    }
    
}
        
        