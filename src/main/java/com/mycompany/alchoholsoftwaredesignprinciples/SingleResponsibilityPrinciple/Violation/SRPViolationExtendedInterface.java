/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.alchoholsoftwaredesignprinciples.SingleResponsibilityPrinciple.Violation;

/**
 *
 * @author Bradz
 */
public interface SRPViolationExtendedInterface extends SRPViolationInterface{
    public String getName();
    public String getType();
    public int getSize()  ;      
    public String getContainerType();
    public double getAlcPercent();
    
}
