/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.alchoholsoftwaredesignprinciples;

import com.mycompany.alchoholsoftwaredesignprinciples.PrincipleofLeastKnowledge.Correction.NewCorrectionInterface;
import com.mycompany.config.BeerConfig;
import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Bradz
 */
public class PLKtest {
    
    public PLKtest() {
    }
    
    
     private static NewCorrectionInterface myObject;
     private static ApplicationContext ctx;
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void plkTest() {
     
         String actual = myObject.violationString();
         Assert.assertEquals("It it equal","This string method is from the beer class in correction package", actual);
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(BeerConfig.class);
        myObject = (NewCorrectionInterface)ctx.getBean("beer1");
        System.out.println("This is in the Before class");
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
