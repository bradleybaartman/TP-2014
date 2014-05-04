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
public class Spirits  implements Serializable{
    private static final long serialVerionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    @Column(unique = true)
    private int sCode;
    private String sName;    
    private String sType;
    private int sSize;
    private String sContainerType;
    private double sAlcPercent;
   
    private Spirits(Builder builder) {
        sCode = builder.sCode;
        sName = builder.sName;
        sType = builder.sType;
        sSize = builder.sSize;
        sContainerType = builder.sContainerType;
        sAlcPercent = builder.sAlcPercent;
        }
    
    public Spirits(){}
    
    public static class Builder{
        private int sCode;
        private String sName;
        private String sType;
        private int sSize;
        private String sContainerType;
        private double sAlcPercent;
        
        public Builder(int sCode){
            this.sCode = sCode;
        }
        
        public Builder sCode(int value)
        {
            sCode = value;
            return this;
        }
        
        public Builder sName(String value){
            this.sName = value;
            return this;
        }
        
        public Builder sType(String value){
            this.sType = value;
            return this;
        }
        
        public Builder sSize(int value){
            this.sSize = value;
            return this;
        }
        
        public Builder sContainerType(String value){
            this.sContainerType = value;
            return this;
        }
        
        public Builder sAlcPercent(double value){
            this.sAlcPercent = value;
            return this;
        }
        public Builder spirits(Spirits spirits){
            sCode = spirits.getCode();
            sName = spirits.getName();
            sType = spirits.getType();
            sSize = spirits.getSize();
            sContainerType = spirits.getConType();
            sAlcPercent = spirits.getAlcPerc();
            return this;
        }
        
        public Spirits build(){
            return new Spirits(this);
        }
        
    }
    
    public int getCode(){
        return sCode;
    }
       
    public String getName(){
        return sName;
    }
    
    public String getType(){
        return sType;
    }
    
    public int getSize(){
        return sSize;
    }
    
    public String getConType(){
        return sContainerType;
    }
    
    public double getAlcPerc(){
        return sAlcPercent;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sName != null ? sName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Spirits)) {
            return false;
        }
        Spirits other = (Spirits) object;
        if ((this.sName == null && other.sName != null) || (this.sName != null && !this.sName.equals(other.sName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bradz.Spirits class[ Spirits code =" + sCode + " ]";
    }     
    
}

