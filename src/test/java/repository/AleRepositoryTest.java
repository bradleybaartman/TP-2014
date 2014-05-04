/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repository;

import com.mycompany.domainrepository.app.conf.ConnectionConfig;
import com.mycompany.domainrepository.domain.Ale;
import com.mycompany.domainrepository.repository.AleRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Bradz
 */
public class AleRepositoryTest {
    public static ApplicationContext ctx;
    private String name;
    private int code;

    private AleRepository repo;    
    
    public AleRepositoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void createAle() {
         repo = ctx.getBean(AleRepository.class);
         Ale a = new Ale.Builder(001)
                 .aName("Jack Black")
                 .aType("Pale Ale")
                 .aSize(330)
                 .aContainerType("Glass")
                 .aAlcPercent(5.00)
                 .build();
         repo.save(a);
         code = a.getCode();
         Assert.assertNotNull(a);
         
     
     }
     
     @Test(dependsOnMethods = "createAle")
     public void readAle(){
         repo = ctx.getBean(AleRepository.class);
         Ale ale = repo.findOne(code);
         Assert.assertEquals(ale.getName(), "Jack Black");
         
     }
     
    @Test(dependsOnMethods = "readAle")
     private void updateAle(){
         repo = ctx.getBean(AleRepository.class);
         Ale ale = repo.findOne(code);
         Ale updatedAle = new Ale.Builder(001)
                 .ale(ale)
                 .aType("Amber Ale")
                 .build();
        
         repo.save(updatedAle);
         
         Ale newAle = repo.findOne(code);
         Assert.assertEquals(newAle.getName(), "Jack Black");
         
     }
     
     @Test(dependsOnMethods = "updateAle")
     private void deleteAle(){
         repo = ctx.getBean(AleRepository.class);
         Ale ale = repo.findOne(code);
         repo.delete(ale);
         
         Ale deletedAle = repo.findOne(code);
         
         Assert.assertNull(deletedAle);
         
         
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
         ctx = new AnnotationConfigApplicationContext(ConnectionConfig.class);
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
