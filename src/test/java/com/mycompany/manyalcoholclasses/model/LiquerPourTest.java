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
public class LiquerPourTest {
    
    public LiquerPourTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void testCreation() throws Exception {
         LiquerPouringTipClass lptc = new LiquerPouringTipClass.Builder("Tilt Glass").id("10").build();
         Assert.assertEquals(lptc.getLiquerPourTip(),"Tilt Glass");
         Assert.assertEquals(lptc.getId(),"10");
     }
     
     @Test
     public void testUpdate() throws Exception {
     LiquerPouringTipClass lptc = new LiquerPouringTipClass.Builder("Tilt Glass").id("10").build();
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
