/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.domainrepository.services;

import com.mycompany.domainrepository.domain.Beer;
import java.util.List;

/**
 *
 * @author Bradz
 */
public interface TotalBeerService {
    public List<Beer> getTotalBeer();
}
