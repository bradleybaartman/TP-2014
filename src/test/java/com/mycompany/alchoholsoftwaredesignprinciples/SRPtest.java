/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.alchoholsoftwaredesignprinciples;

import com.mycompany.alchoholsoftwaredesignprinciples.PrincipleofLeastKnowledge.Correction.NewCorrectionInterface;
import com.mycompany.alchoholsoftwaredesignprinciples.SingleResponsibilityPrinciple.Correction.AlcoholInterface;
import com.mycompany.config.AlcoholConfig;
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
public class SRPtest {
    
    private static AlcoholInterface myObject;
    private static ApplicationContext ctx;
    
    public SRPtest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void srpTest() {
         String actual = myObject.getName();
         Assert.assertEquals("It it not equal","Captain Morgan", actual);
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AlcoholConfig.class);
        myObject = (AlcoholInterface)ctx.getBean("spiritsBean");
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
