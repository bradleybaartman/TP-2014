/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.domainrepository.services.Impl;

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
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Bradz
 */
@Service
public class AlcoholPercentageServiceImpl implements AlcoholPercentageService{
    @Autowired
    private BeerRepository beerRepository;
    @Autowired
    private AleRepository aleRepository;
    @Autowired
    private ChampagneRepository champagneRepository;
    @Autowired
    private CiderRepository ciderRepository;
    @Autowired
    private LiquerRepository liquerRepository;
    @Autowired
    private SpiritsRepository spiritsRepository;
    @Autowired
    private WhiskeyRepository whiskeyRepository;
    @Autowired
    private WineRepository wineRepository;
    
    
    @Override
     public List<Beer> getBeerAlcPerc(double bAlcPercent) {
        List<Beer> beers = new ArrayList<>();
        List<Beer> allBeers = beerRepository.findAll();

        for (Beer beer : allBeers) {
            if (beer.getAlcPerc() > bAlcPercent) {
                beers.add(beer);
            }
        }
        return beers;
    }
    
    @Override
     public List<Ale> getAleAlcPerc(double aAlcPercent) {
        List<Ale> ales = new ArrayList<>();
        List<Ale> allAles = aleRepository.findAll();

        for (Ale ale : allAles) {
            if (ale.getAlcPerc() > aAlcPercent) {
                ales.add(ale);
            }
        }
        return ales;
    }
    
    @Override
     public List<Champagne> getChampagneAlcPerc(double chAlcPercent) {
        List<Champagne> champagnes = new ArrayList<>();
        List<Champagne> allChampagnes = champagneRepository.findAll();

        for (Champagne champagne : allChampagnes) {
            if (champagne.getAlcPerc() > chAlcPercent) {
                champagnes.add(champagne);
            }
        }
        return champagnes;
    }
     
    @Override
     public List<Cider> getCiderAlcPerc(double cAlcPercent) {
        List<Cider> ciders = new ArrayList<>();
        List<Cider> allCiders = ciderRepository.findAll();

        for (Cider cider : allCiders) {
            if (cider.getAlcPerc() > cAlcPercent) {
                ciders.add(cider);
            }
        }
        return ciders;
    }
    
    @Override
     public List<Liquer> getLiquerAlcPerc(double lAlcPercent) {
        List<Liquer> liquers = new ArrayList<>();
        List<Liquer> allLiquers = liquerRepository.findAll();

        for (Liquer liquer : allLiquers) {
            if (liquer.getAlcPerc() > lAlcPercent) {
                liquers.add(liquer);
            }
        }
        return liquers;
     }
     
    @Override
     public List<Spirits> getSpiritsAlcPerc(double sAlcPercent) {
        List<Spirits> spirits = new ArrayList<>();
        List<Spirits> allSpirits = spiritsRepository.findAll();

        for (Spirits spirit : allSpirits) {
            if (spirit.getAlcPerc() > sAlcPercent) {
                spirits.add(spirit);
            }
        }
        return spirits;
    }
     
    @Override
     public List<Whiskey> getWhiskeyAlcPerc(double whAlcPercent) {
        List<Whiskey> whiskeys = new ArrayList<>();
        List<Whiskey> allWhiskeys = whiskeyRepository.findAll();

        for (Whiskey whiskey : allWhiskeys) {
            if (whiskey.getAlcPerc() > whAlcPercent) {
                whiskeys.add(whiskey);
            }
        }
        return whiskeys;
    }
     
    @Override
     public List<Wine2> getWineAlcPerc(double wAlcPercent) {
        List<Wine2> wines = new ArrayList<>();
        List<Wine2> allWines = wineRepository.findAll();

        for (Wine2 wine : allWines) {
            if (wine.getAlcPerc() > wAlcPercent) {
                wines.add(wine);
            }
        }
        return wines;
    }
}
