/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repository;

import com.mycompany.domainrepository.app.conf.ConnectionConfig;
import com.mycompany.domainrepository.domain.Beer;
import com.mycompany.domainrepository.repository.BeerRepository;
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
public class BeerRepositoryTest {
    public static ApplicationContext ctx;
    private String name;

    private BeerRepository repo;    
    
    public BeerRepositoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void createBeer() {
         repo = ctx.getBean(BeerRepository.class);
         Beer b = new Beer.Builder("Amstel")
                 .bType("Lager")
                 .bSize(330)
                 .bContainerType("Glass")
                 .bAlcPercent(5.00)
                 .build();
         repo.save(b);
         name = b.getName();
         Assert.assertNotNull(b);
         
     
     }
     
     @Test(dependsOnMethods = "createBeer")
     public void readBeer(){
         repo = ctx.getBean(BeerRepository.class);
         Beer beer = repo.findOne(name);
         Assert.assertEquals(beer.getName(), "Amstel");
         
     }
     
    @Test(dependsOnMethods = "readBeer")
     private void updateBeer(){
         repo = ctx.getBean(BeerRepository.class);
         Beer beer = repo.findOne(name);
         Beer updatedBeer = new Beer.Builder("kabasob@cput.ac.za")
                 .beer(beer)
                 .bType("Lite")
                 .build();
        
         repo.save(updatedBeer);
         
         Beer newBeer = repo.findOne(name);
         Assert.assertEquals(newBeer.getName(), "Amstel");
         
     }
     
     @Test(dependsOnMethods = "updateBeer")
     private void deleteBeer(){
         repo = ctx.getBean(BeerRepository.class);
         Beer beer = repo.findOne(name);
         repo.delete(beer);
         
         Beer deletedBeer = repo.findOne(name);
         
         Assert.assertNull(deletedBeer);
         
         
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
