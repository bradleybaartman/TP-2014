/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repository;

import com.mycompany.domainrepository.app.conf.ConnectionConfig;
import com.mycompany.domainrepository.domain.Whiskey;
import com.mycompany.domainrepository.repository.WhiskeyRepository;
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
public class WhiskeyRepositoryTest {
    public static ApplicationContext ctx;
    private String name;
    private int code;

    private WhiskeyRepository repo;    
    
    public WhiskeyRepositoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void createWhiskey() {
         repo = ctx.getBean(WhiskeyRepository.class);
         Whiskey b = new Whiskey.Builder(001)
                 .whName("Bell's")
                 .whType("Scotch Whiskey")
                 .whSize(750)
                 .whContainerType("Glass")
                 .whAlcPercent(43.00)
                 .build();
         repo.save(b);
         code = b.getCode();
         Assert.assertNotNull(b);
         
     
     }
     
     @Test(dependsOnMethods = "createWhiskey")
     public void readWhiskey(){
         repo = ctx.getBean(WhiskeyRepository.class);
         Whiskey whiskey = repo.findOne(code);
         Assert.assertEquals(whiskey.getName(), "Bell's");
         
     }
     
    @Test(dependsOnMethods = "readWhiskey")
     private void updateWhiskey(){
         repo = ctx.getBean(WhiskeyRepository.class);
         Whiskey whiskey = repo.findOne(code);
         Whiskey updatedWhiskey = new Whiskey.Builder(001)
                 .whiskey(whiskey)
                 .whType("Old Scotch Whiskey")
                 .build();
        
         repo.save(updatedWhiskey);
         
         Whiskey newWhiskey = repo.findOne(code);
         Assert.assertEquals(newWhiskey.getName(), "Bell's");
         
     }
     
     @Test(dependsOnMethods = "updateWhiskey")
     private void deleteWhiskey(){
         repo = ctx.getBean(WhiskeyRepository.class);
         Whiskey whiskey = repo.findOne(code);
         repo.delete(whiskey);
         
         Whiskey deletedWhiskey = repo.findOne(code);
         
         Assert.assertNull(deletedWhiskey);
         
         
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
