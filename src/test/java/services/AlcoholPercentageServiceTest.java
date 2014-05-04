/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;


import com.mycompany.domainrepository.app.conf.ConnectionConfig;
import com.mycompany.domainrepository.domain.Beer;
import com.mycompany.domainrepository.repository.BeerRepository;
import com.mycompany.domainrepository.services.AlcoholPercentageService;
import com.mycompany.domainrepository.services.Impl.AlcoholPercentageServiceImpl;
import java.util.List;
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
public class AlcoholPercentageServiceTest {
        private static ApplicationContext ctx;
        private AlcoholPercentageService alcoholPercentageService;
        private BeerRepository beerRepository;
    
    public AlcoholPercentageServiceTest() {
    }
//     TODO add test methods here.
  //   The methods must be annotated with annotation @Test. For example:
    
  

     @Test
    public void getBeerAlcPercentage() {
        beerRepository = ctx.getBean(BeerRepository.class);
        alcoholPercentageService = ctx.getBean(AlcoholPercentageService.class);
        
        Beer b1 = new Beer.Builder(001)
                .bAlcPercent(5.00).build();                
        Beer b2 = new Beer.Builder(002)
                .bAlcPercent(6.00).build();  
        Beer b3 = new Beer.Builder(003)
                .bAlcPercent(7.00).build();  

        beerRepository.save(b1);
        beerRepository.save(b2);
        beerRepository.save(b3);

        List<Beer> beerAlcList = alcoholPercentageService.getAlcPerc(4.00);

        Assert.assertEquals(beerAlcList.size(), 3);

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
       beerRepository = ctx.getBean(BeerRepository.class);
      beerRepository.deleteAll();
   }
}
