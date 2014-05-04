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
public class Cider implements Serializable{
    private static final long serialVerionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    @Column(unique = true)
    private int cCode;
    private String cName;    
    private String cType;
    private int cSize;
    private String cContainerType;
    private double cAlcPercent;
   
    private Cider(Builder builder) {
        cCode = builder.cCode;
        cName = builder.cName;
        cType = builder.cType;
        cSize = builder.cSize;
        cContainerType = builder.cContainerType;
        cAlcPercent = builder.cAlcPercent;
        }
    
    public Cider(){}
    
    public static class Builder{
        private int cCode;
        private String cName;
        private String cType;
        private int cSize;
        private String cContainerType;
        private double cAlcPercent;
        
        public Builder(int bCode){
            this.cCode = cCode;
        }
        
        public Builder cCode(int value)
        {
            cCode = value;
            return this;
        }
        
        public Builder cName(String value){
            this.cName = value;
            return this;
        }
        
        public Builder cType(String value){
            this.cType = value;
            return this;
        }
        
        public Builder cSize(int value){
            this.cSize = value;
            return this;
        }
        
        public Builder cContainerType(String value){
            this.cContainerType = value;
            return this;
        }
        
        public Builder cAlcPercent(double value){
            this.cAlcPercent = value;
            return this;
        }
        public Builder cider(Cider cider){
            cCode = cider.getCode();
            cName = cider.getName();
            cType = cider.getType();
            cSize = cider.getSize();
            cContainerType = cider.getConType();
            cAlcPercent = cider.getAlcPerc();
            return this;
        }
        
        public Cider build(){
            return new Cider(this);
        }
        
    }
    
    public int getCode(){
        return cCode;
    }
       
    public String getName(){
        return cName;
    }
    
    public String getType(){
        return cType;
    }
    
    public int getSize(){
        return cSize;
    }
    
    public String getConType(){
        return cContainerType;
    }
    
    public double getAlcPerc(){
        return cAlcPercent;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cName != null ? cName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cider)) {
            return false;
        }
        Cider other = (Cider) object;
        if ((this.cName == null && other.cName != null) || (this.cName != null && !this.cName.equals(other.cName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bradz.Cider class[ Cider code =" + cCode + " ]";
    }
    
}
        
        