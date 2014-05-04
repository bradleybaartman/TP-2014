/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package repository;

import com.mycompany.domainrepository.app.conf.ConnectionConfig;
import com.mycompany.domainrepository.domain.Spirits;
import com.mycompany.domainrepository.repository.SpiritsRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static repository.SpiritsRepositoryTest.ctx;

/**
 *
 * @author Bradz
 */
public class SpiritsRepositoryTest {
    public static ApplicationContext ctx;
    private String name;
    private int code;

    private SpiritsRepository repo;    
    
    public SpiritsRepositoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void createSpirits() {
         repo = ctx.getBean(SpiritsRepository.class);
         Spirits s = new Spirits.Builder(001)
                 .sName("Captain Morgan Spiced Gold")
                 .sType("Rum")
                 .sSize(750)
                 .sContainerType("Glass")
                 .sAlcPercent(35.00)
                 .build();
         repo.save(s);
         code = s.getCode();
         Assert.assertNotNull(s);
         
     
     }
     
     @Test(dependsOnMethods = "createSpirits")
     public void readSpirits(){
         repo = ctx.getBean(SpiritsRepository.class);
         Spirits spirits = repo.findOne(code);
         Assert.assertEquals(spirits.getName(), "Captain Morgan Spiced Gold");
         
     }
     
    @Test(dependsOnMethods = "readSpirits")
     private void updateSpirits(){
         repo = ctx.getBean(SpiritsRepository.class);
         Spirits spirits = repo.findOne(code);
         Spirits updatedSpirits = new Spirits.Builder(001)
                 .spirits(spirits)
                 .sType("Rum")
                 .build();
        
         repo.save(updatedSpirits);
         
         Spirits newSpirits = repo.findOne(code);
         Assert.assertEquals(newSpirits.getName(), "Captain Morgan Spiced Gold");
         
     }
     
     @Test(dependsOnMethods = "updateSpirits")
     private void deleteSpirits(){
         repo = ctx.getBean(SpiritsRepository.class);
         Spirits spirits = repo.findOne(code);
         repo.delete(spirits);
         
         Spirits deletedSpirits = repo.findOne(code);
         
         Assert.assertNull(deletedSpirits);
         
         
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
