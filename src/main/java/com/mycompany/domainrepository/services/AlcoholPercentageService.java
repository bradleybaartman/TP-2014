/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.domainrepository.services;

import com.mycompany.domainrepository.domain.Ale;
import com.mycompany.domainrepository.domain.Beer;
import com.mycompany.domainrepository.domain.Champagne;
import com.mycompany.domainrepository.domain.Cider;
import com.mycompany.domainrepository.domain.Liquer;
import com.mycompany.domainrepository.domain.Spirits;
import com.mycompany.domainrepository.domain.Whiskey;
import com.mycompany.domainrepository.domain.Wine2;
import java.util.List;

/**
 *
 * @author Bradz
 */
public interface AlcoholPercentageService {
    public List<Beer> getBeerAlcPerc(double i);
    public List<Ale> getAleAlcPerc(double i);
    public List<Champagne> getChampagneAlcPerc(double i);
    public List<Cider> getCiderAlcPerc(double i);
    public List<Liquer> getLiquerAlcPerc(double i);
    public List<Spirits> getSpiritsAlcPerc(double i);
    public List<Whiskey> getWhiskeyAlcPerc(double i);
    public List<Wine2> getWineAlcPerc(double i);
    
}
