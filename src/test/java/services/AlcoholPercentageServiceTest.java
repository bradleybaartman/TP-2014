/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;


import com.mycompany.domainrepository.app.conf.ConnectionConfig;
import com.mycompany.domainrepository.domain.Ale;
import com.mycompany.domainrepository.domain.Beer;
import com.mycompany.domainrepository.domain.Champagne;
import com.mycompany.domainrepository.domain.Cider;
import com.mycompany.domainrepository.domain.Liquer;
import com.mycompany.domainrepository.domain.Spirits;
import com.mycompany.domainrepository.domain.Whiskey;
import com.mycompany.domainrepository.domain.Wine2;
import com.mycompany.domainrepository.repository.AleRepository;
import com.mycompany.domainrepository.repository.BeerRepository;
import com.mycompany.domainrepository.repository.ChampagneRepository;
import com.mycompany.domainrepository.repository.CiderRepository;
import com.mycompany.domainrepository.repository.LiquerRepository;
import com.mycompany.domainrepository.repository.SpiritsRepository;
import com.mycompany.domainrepository.repository.WhiskeyRepository;
import com.mycompany.domainrepository.repository.WineRepository;
import com.mycompany.domainrepository.services.AlcoholPercentageService;
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
        private AleRepository aleRepository;
        private ChampagneRepository champagneRepository;
        private CiderRepository ciderRepository;
        private LiquerRepository liquerRepository; 
        private SpiritsRepository spiritsRepository;
        private WhiskeyRepository whiskeyRepository;
        private WineRepository wineRepository;
        
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

        List<Beer> beerAlcList = alcoholPercentageService.getBeerAlcPerc(4.00);

        Assert.assertEquals(beerAlcList.size(), 3);

    }
    @Test
    public void getAleAlcPercentage() {
        aleRepository = ctx.getBean(AleRepository.class);
        alcoholPercentageService = ctx.getBean(AlcoholPercentageService.class);
        
        Ale b1 = new Ale.Builder(001)
                .aAlcPercent(5.00).build();                
        Ale b2 = new Ale.Builder(002)
                .aAlcPercent(6.00).build();  
        Ale b3 = new Ale.Builder(003)
                .aAlcPercent(7.00).build();  

        aleRepository.save(b1);
        aleRepository.save(b2);
        aleRepository.save(b3);

        List<Ale> aleAlcList = alcoholPercentageService.getAleAlcPerc(4.00);

        Assert.assertEquals(aleAlcList.size(), 3);

    }
    @Test
    public void getChampagneAlcPercentage() {
        champagneRepository = ctx.getBean(ChampagneRepository.class);
        alcoholPercentageService = ctx.getBean(AlcoholPercentageService.class);
        
        Champagne b1 = new Champagne.Builder(001)
                .chAlcPercent(5.00).build();                
        Champagne b2 = new Champagne.Builder(002)
                .chAlcPercent(6.00).build();  
        Champagne b3 = new Champagne.Builder(003)
                .chAlcPercent(7.00).build();  

        champagneRepository.save(b1);
        champagneRepository.save(b2);
        champagneRepository.save(b3);

        List<Champagne> champagneAlcList = alcoholPercentageService.getChampagneAlcPerc(4.00);

        Assert.assertEquals(champagneAlcList.size(), 3);

    }
    @Test
    public void getCiderAlcPercentage() {
        ciderRepository = ctx.getBean(CiderRepository.class);
        alcoholPercentageService = ctx.getBean(AlcoholPercentageService.class);
        
        Cider b1 = new Cider.Builder(001)
                .cAlcPercent(5.00).build();                
        Cider b2 = new Cider.Builder(002)
                .cAlcPercent(6.00).build();  
        Cider b3 = new Cider.Builder(003)
                .cAlcPercent(7.00).build();  

        ciderRepository.save(b1);
        ciderRepository.save(b2);
        ciderRepository.save(b3);

        List<Cider> ciderAlcList = alcoholPercentageService.getCiderAlcPerc(4.00);

        Assert.assertEquals(ciderAlcList.size(), 3);

    }
    @Test
    public void getLiquerAlcPercentage() {
        liquerRepository = ctx.getBean(LiquerRepository.class);
        alcoholPercentageService = ctx.getBean(AlcoholPercentageService.class);
        
        Liquer b1 = new Liquer.Builder(001)
                .lAlcPercent(5.00).build();                
        Liquer b2 = new Liquer.Builder(002)
                .lAlcPercent(6.00).build();  
        Liquer b3 = new Liquer.Builder(003)
                .lAlcPercent(7.00).build();  
        
        liquerRepository.save(b1);
        liquerRepository.save(b2);
        liquerRepository.save(b3);

        List<Liquer> liquerAlcList = alcoholPercentageService.getLiquerAlcPerc(4.00);

        Assert.assertEquals(liquerAlcList.size(), 3);

    }
    @Test
    public void getSpiritsAlcPercentage() {
        spiritsRepository = ctx.getBean(SpiritsRepository.class);
        alcoholPercentageService = ctx.getBean(AlcoholPercentageService.class);
        
        Spirits b1 = new Spirits.Builder(001)
                .sAlcPercent(5.00).build();                
        Spirits b2 = new Spirits.Builder(002)
                .sAlcPercent(6.00).build();  
        Spirits b3 = new Spirits.Builder(003)
                .sAlcPercent(7.00).build();  

        spiritsRepository.save(b1);
        spiritsRepository.save(b2);
        spiritsRepository.save(b3);

        List<Spirits> spiritsAlcList = alcoholPercentageService.getSpiritsAlcPerc(4.00);

        Assert.assertEquals(spiritsAlcList.size(), 3);

    }
    @Test
    public void getWhiskeyAlcPercentage() {
        whiskeyRepository = ctx.getBean(WhiskeyRepository.class);
        alcoholPercentageService = ctx.getBean(AlcoholPercentageService.class);
        
        Whiskey b1 = new Whiskey.Builder(001)
                .whAlcPercent(5.00).build();                
        Whiskey b2 = new Whiskey.Builder(002)
                .whAlcPercent(6.00).build();  
        Whiskey b3 = new Whiskey.Builder(003)
                .whAlcPercent(7.00).build();  

        whiskeyRepository.save(b1);
        whiskeyRepository.save(b2);
        whiskeyRepository.save(b3);

        List<Whiskey> whiskeyAlcList = alcoholPercentageService.getWhiskeyAlcPerc(4.00);

        Assert.assertEquals(whiskeyAlcList.size(), 3);

    }
    @Test
    public void getWineAlcPercentage() {
        wineRepository = ctx.getBean(WineRepository.class);
        alcoholPercentageService = ctx.getBean(AlcoholPercentageService.class);
        
        Wine2 b1 = new Wine2.Builder(001)
                .wAlcPercent(5.00).build();                
        Wine2 b2 = new Wine2.Builder(002)
                .wAlcPercent(6.00).build();  
        Wine2 b3 = new Wine2.Builder(003)
                .wAlcPercent(7.00).build();  

        wineRepository.save(b1);
        wineRepository.save(b2);
        wineRepository.save(b3);

        List<Wine2> wineAlcList = alcoholPercentageService.getWineAlcPerc(4.00);

        Assert.assertEquals(wineAlcList.size(), 3);

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
       aleRepository = ctx.getBean(AleRepository.class);
       champagneRepository = ctx.getBean(ChampagneRepository.class);
       liquerRepository = ctx.getBean(LiquerRepository.class);
       spiritsRepository = ctx.getBean(SpiritsRepository.class);
       whiskeyRepository = ctx.getBean(WhiskeyRepository.class);
       wineRepository = ctx.getBean(WineRepository.class);
       ciderRepository = ctx.getBean(CiderRepository.class);
      beerRepository.deleteAll();
      aleRepository.deleteAll();
      champagneRepository.deleteAll();
      liquerRepository.deleteAll();
      spiritsRepository.deleteAll();
      whiskeyRepository.deleteAll();
      wineRepository.deleteAll();
      ciderRepository.deleteAll();
      
      
      
      
      
   }
}
