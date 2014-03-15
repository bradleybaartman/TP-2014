/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.manyalcoholclasses.service.crud.Impl;

import com.mycompany.manyalcoholclasses.model.AlePouringTipClass;
import com.mycompany.manyalcoholclasses.service.crud.AlePouringTipCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Bradz
 */
public class AlePouringTipCrudServiceImpl implements AlePouringTipCrudService{
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public AlePouringTipClass find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public AlePouringTipClass persist(AlePouringTipClass entity) {

        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public AlePouringTipClass merge(AlePouringTipClass entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public AlePouringTipClass remove(AlePouringTipClass entity) {
        return  null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<AlePouringTipClass> findAll() {
        return null;
    }
}
