/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repository;

import com.mycompany.domainrepository.app.conf.ConnectionConfig;
import com.mycompany.domainrepository.domain.Cider;
import com.mycompany.domainrepository.repository.CiderRepository;
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
public class CiderRepositoryTest {
    public static ApplicationContext ctx;
    private String name;
    private int code;

    private CiderRepository repo;    
    
    public CiderRepositoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void createCider() {
         repo = ctx.getBean(CiderRepository.class);
         Cider c = new Cider.Builder(001)
                 .cName("Hunters")
                 .cType("Dry")
                 .cSize(330)
                 .cContainerType("Glass")
                 .cAlcPercent(5.00)
                 .build();
         repo.save(c);
         code = c.getCode();
         Assert.assertNotNull(c);
         
     
     }
     
     @Test(dependsOnMethods = "createCider")
     public void readCider(){
         repo = ctx.getBean(CiderRepository.class);
         Cider cider = repo.findOne(code);
         Assert.assertEquals(cider.getName(), "Hunters");
         
     }
     
    @Test(dependsOnMethods = "readCider")
     private void updateCider(){
         repo = ctx.getBean(CiderRepository.class);
         Cider cider = repo.findOne(code);
         Cider updatedCider = new Cider.Builder(001)
                 .cider(cider)
                 .cType("Gold")
                 .build();
        
         repo.save(updatedCider);
         
         Cider newCider = repo.findOne(code);
         Assert.assertEquals(newCider.getName(), "Hunters");
         
     }
     
     @Test(dependsOnMethods = "updateCider")
     private void deleteCider(){
         repo = ctx.getBean(CiderRepository.class);
         Cider cider = repo.findOne(code);
         repo.delete(cider);
         
         Cider deletedCider = repo.findOne(code);
         
         Assert.assertNull(deletedCider);
         
         
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
