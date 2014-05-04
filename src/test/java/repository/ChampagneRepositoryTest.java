/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repository;

import com.mycompany.domainrepository.app.conf.ConnectionConfig;
import com.mycompany.domainrepository.domain.Champagne;
import com.mycompany.domainrepository.repository.ChampagneRepository;
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
public class ChampagneRepositoryTest {
    public static ApplicationContext ctx;
    private String name;
    private int code;

    private ChampagneRepository repo;    
    
    public ChampagneRepositoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void createChampagne() {
         repo = ctx.getBean(ChampagneRepository.class);
         Champagne ch = new Champagne.Builder(001)
                 .chName("Laurent Perrier")
                 .chType("Rose Champagne")
                 .chSize(750)
                 .chContainerType("Glass")
                 .chAlcPercent(11.00)
                 .build();
         repo.save(ch);
         code = ch.getCode();
         Assert.assertNotNull(ch);
         
     
     }
     
     @Test(dependsOnMethods = "createChampagne")
     public void readChampagne(){
         repo = ctx.getBean(ChampagneRepository.class);
         Champagne champagne = repo.findOne(code);
         Assert.assertEquals(champagne.getName(), "Laurent Perrier");
         
     }
     
    @Test(dependsOnMethods = "readChampagne")
     private void updateChampagne(){
         repo = ctx.getBean(ChampagneRepository.class);
         Champagne champagne = repo.findOne(code);
         Champagne updatedChampagne = new Champagne.Builder(001)
                 .champagne(champagne)
                 .chType("Champagne NV")
                 .build();
        
         repo.save(updatedChampagne);
         
         Champagne newChampagne = repo.findOne(code);
         Assert.assertEquals(newChampagne.getName(), "Laurent Perrier");
         
     }
     
     @Test(dependsOnMethods = "updateChampagne")
     private void deleteChampagne(){
         repo = ctx.getBean(ChampagneRepository.class);
         Champagne champagne = repo.findOne(code);
         repo.delete(champagne);
         
         Champagne deletedChampagne = repo.findOne(code);
         
         Assert.assertNull(deletedChampagne);
         
         
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
