/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.manyalcoholclasses.service.crud.Impl;

import com.mycompany.manyalcoholclasses.service.crud.BeerPouringTipCrudService;
import com.mycompany.manyalcoholclasses.model.BeerPouringTipClass;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Bradz
 */
public class BeerPouringTipCrudServiceImpl implements BeerPouringTipCrudService{
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public BeerPouringTipClass find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public BeerPouringTipClass persist(BeerPouringTipClass entity) {

        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public BeerPouringTipClass merge(BeerPouringTipClass entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public BeerPouringTipClass remove(BeerPouringTipClass entity) {
        return  null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<BeerPouringTipClass> findAll() {
        return null;
    }
}
