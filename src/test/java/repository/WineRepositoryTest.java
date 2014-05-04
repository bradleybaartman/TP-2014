/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repository;

import com.mycompany.domainrepository.app.conf.ConnectionConfig;
import com.mycompany.domainrepository.domain.Wine2;
import com.mycompany.domainrepository.repository.WineRepository;
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
public class WineRepositoryTest {
     public static ApplicationContext ctx;
    private String name;
    private int code;
    
    private WineRepository repo;
    
    public WineRepositoryTest() {
    }
    
@Test
     public void createWine() {
         repo = ctx.getBean(WineRepository.class);
         Wine2 w = new Wine2.Builder(001)
                 .wFarmName("Arabella")
                 .wType("Sauvignon Blanc")
                 .wYear(2013)
                 .wSize(330)
                 .wContainerType("Glass")
                 .wAlcPercent(13.00)
                 .build();
         repo.save(w);
         code = w.getCode();
         Assert.assertNotNull(w);
         
     
     }
     
     @Test(dependsOnMethods = "createWine")
     public void readWine(){
         repo = ctx.getBean(WineRepository.class);
         Wine2 wine = repo.findOne(code);
         Assert.assertEquals(wine.getFarmName(), "Arabella");
         
     }
     
    @Test(dependsOnMethods = "readWine")
     private void updateWine(){
         repo = ctx.getBean(WineRepository.class);
         Wine2 wine = repo.findOne(code);
         Wine2 updatedWine = new Wine2.Builder(001)
                 .wine(wine)
                 .wType("Cabernet Sauvignon")
                 .build();
        
         repo.save(updatedWine);
         
         Wine2 newWine = repo.findOne(code);
         Assert.assertEquals(newWine.getFarmName(), "Arabella");
         
     }
     
     @Test(dependsOnMethods = "updateWine")
     private void deleteWine(){
         repo = ctx.getBean(WineRepository.class);
         Wine2 wine = repo.findOne(code);
         repo.delete(wine);
         
         Wine2 deletedWine = repo.findOne(code);
         
         Assert.assertNull(deletedWine);
         
         
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
