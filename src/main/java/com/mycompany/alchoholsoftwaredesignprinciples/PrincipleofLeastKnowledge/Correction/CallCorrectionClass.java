/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.alchoholsoftwaredesignprinciples.PrincipleofLeastKnowledge.Correction;

/**
 *
 * @author Bradz
 */
public class CallCorrectionClass {
    public void CallMethod()
    {
        NewCorrectionInterface nci = new NewCorrectionInterface() {

            public String violationString() {
                throw new UnsupportedOperationException("Not supported yet.");
                
            }

            public String getName() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public String getType() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public int getSize() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public String getContainerType() {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public double getAlcPercent() {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };
        
        nci.violationString();
    }
}
