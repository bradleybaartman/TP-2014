/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.domainrepository.services.Impl;

import com.mycompany.domainrepository.domain.Beer;
import com.mycompany.domainrepository.repository.BeerRepository;
import com.mycompany.domainrepository.services.TotalBeerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Bradz
 */
//@Service
public class TotalBeerServiceImpl implements TotalBeerService{
    @Autowired
    private BeerRepository beerRepository;
    
    @Override
    public List<Beer> getTotalBeer() {
        return beerRepository.findAll();
        }
}
