/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.domainrepository.services.Impl;

import com.mycompany.domainrepository.domain.Beer;
import com.mycompany.domainrepository.repository.BeerRepository;
import com.mycompany.domainrepository.services.AlcoholPercentageService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author Bradz
 */
public class AlcoholPercentageServiceImpl implements AlcoholPercentageService{
    @Autowired
    private BeerRepository beerRepository;
    
    @Override
     public List<Beer> getAlcPerc(double bAlcPercent) {
        List<Beer> beers = new ArrayList<>();
        List<Beer> allBeers = beerRepository.findAll();

        for (Beer beer : allBeers) {
            if (beer.getAlcPerc() > bAlcPercent) {
                beers.add(beer);
            }
        }
        return beers;
    }
    
}
