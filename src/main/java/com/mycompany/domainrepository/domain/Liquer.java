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
public class Liquer implements Serializable{
    private static final long serialVerionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    @Column(unique = true)
    private int lCode;
    private String lName;    
    private String lType;
    private int lSize;
    private String lContainerType;
    private double lAlcPercent;
   
    private Liquer(Builder builder) {
        lCode = builder.lCode;
        lName = builder.lName;
        lType = builder.lType;
        lSize = builder.lSize;
        lContainerType = builder.lContainerType;
        lAlcPercent = builder.lAlcPercent;
        }
    
    public Liquer(){}
    
    public static class Builder{
        private int lCode;
        private String lName;
        private String lType;
        private int lSize;
        private String lContainerType;
        private double lAlcPercent;
        
        public Builder(int lCode){
            this.lCode = lCode;
        }
        
        public Builder lCode(int value)
        {
            lCode = value;
            return this;
        }
        
        public Builder lName(String value){
            this.lName = value;
            return this;
        }
        
        public Builder lType(String value){
            this.lType = value;
            return this;
        }
        
        public Builder lSize(int value){
            this.lSize = value;
            return this;
        }
        
        public Builder lContainerType(String value){
            this.lContainerType = value;
            return this;
        }
        
        public Builder lAlcPercent(double value){
            this.lAlcPercent = value;
            return this;
        }
        public Builder liquer(Liquer liquer){
            lCode = liquer.getCode();
            lName = liquer.getName();
            lType = liquer.getType();
            lSize = liquer.getSize();
            lContainerType = liquer.getConType();
            lAlcPercent = liquer.getAlcPerc();
            return this;
        }
        
        public Liquer build(){
            return new Liquer(this);
        }
        
    }
    
    public int getCode(){
        return lCode;
    }
       
    public String getName(){
        return lName;
    }
    
    public String getType(){
        return lType;
    }
    
    public int getSize(){
        return lSize;
    }
    
    public String getConType(){
        return lContainerType;
    }
    
    public double getAlcPerc(){
        return lAlcPercent;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lName != null ? lName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Liquer)) {
            return false;
        }
        Liquer other = (Liquer) object;
        if ((this.lName == null && other.lName != null) || (this.lName != null && !this.lName.equals(other.lName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bradz.Liquer class[ Liquer code =" + lCode + " ]";
    }
    
}
        
        