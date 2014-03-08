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
public class SpiritsPourTest {
    
    public SpiritsPourTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void testCreation() throws Exception {
         SpiritsPouringTipClass sptc = new SpiritsPouringTipClass.Builder("Tilt Glass").id("10").build();
         Assert.assertEquals(sptc.getSpiritsPourTip(),"Tilt Glass");
         Assert.assertEquals(sptc.getId(),"10");
     }
     
     @Test
     public void testUpdate() throws Exception {
     SpiritsPouringTipClass sptc = new SpiritsPouringTipClass.Builder("Tilt Glass").id("10").build();
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
