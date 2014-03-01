/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.alchoholsoftwaredesignprinciples.PrincipleofLeastKnowledge.Violation;

/**
 *
 * @author Bradz
 */
public class CallViolationClass {
    
    public void callMethod()
    {
        BeerClass bc = new BeerClass();
        
        bc.nvc.violationString();
    }
    
}
