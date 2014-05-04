/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repository;

import com.mycompany.domainrepository.app.conf.ConnectionConfig;
import com.mycompany.domainrepository.domain.Liquer;
import com.mycompany.domainrepository.repository.LiquerRepository;
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
public class LiquerRepositoryTest {
    public static ApplicationContext ctx;
    private String name;
    private int code;

    private LiquerRepository repo;    
    
    public LiquerRepositoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void createLiquer() {
         repo = ctx.getBean(LiquerRepository.class);
         Liquer b = new Liquer.Builder(001)
                 .lName("Cape Velvet")
                 .lType("Cream Liquer")
                 .lSize(750)
                 .lContainerType("Glass")
                 .lAlcPercent(5.00)
                 .build();
         repo.save(b);
         code = b.getCode();
         Assert.assertNotNull(b);
         
     
     }
     
     @Test(dependsOnMethods = "createLiquer")
     public void readLiquer(){
         repo = ctx.getBean(LiquerRepository.class);
         Liquer liquer = repo.findOne(code);
         Assert.assertEquals(liquer.getName(), "Cape Velvet");
         
     }
     
    @Test(dependsOnMethods = "readLiquer")
     private void updateLiquer(){
         repo = ctx.getBean(LiquerRepository.class);
         Liquer liquer = repo.findOne(code);
         Liquer updatedLiquer = new Liquer.Builder(001)
                 .liquer(liquer)
                 .lType("Cream Liquer")
                 .build();
        
         repo.save(updatedLiquer);
         
         Liquer newLiquer = repo.findOne(code);
         Assert.assertEquals(newLiquer.getName(), "Cape Velvet");
         
     }
     
     @Test(dependsOnMethods = "updateLiquer")
     private void deleteLiquer(){
         repo = ctx.getBean(LiquerRepository.class);
         Liquer liquer = repo.findOne(code);
         repo.delete(liquer);
         
         Liquer deletedLiquer = repo.findOne(code);
         
         Assert.assertNull(deletedLiquer);
         
         
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
