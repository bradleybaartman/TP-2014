/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.manyalcoholclasses.model;

import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Bradz
 */
public class CiderPourTest {
    
    public CiderPourTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void testCreation() throws Exception {
         CiderPouringTipClass cptc = new CiderPouringTipClass.Builder("Tilt Glass").id("10").build();
         Assert.assertEquals(cptc.getCiderPourTip(),"Tilt Glass");
         Assert.assertEquals(cptc.getId(),"10");
     }
     
     @Test
     public void testUpdate() throws Exception {
     AlePouringTipClass aptc = new AlePouringTipClass.Builder("Tilt Glass").id("10").build();
     }
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
