/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.manyalcoholclasses.service.crud.Impl;

import com.mycompany.manyalcoholclasses.model.SpiritsPouringTipClass;
import com.mycompany.manyalcoholclasses.service.crud.SpiritsPouringTipCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Bradz
 */
public class SpirirtsPouringTipCrudServiceImpl implements SpiritsPouringTipCrudService{
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public SpiritsPouringTipClass find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public SpiritsPouringTipClass persist(SpiritsPouringTipClass entity) {

        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public SpiritsPouringTipClass merge(SpiritsPouringTipClass entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public SpiritsPouringTipClass remove(SpiritsPouringTipClass entity) {
        return  null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<SpiritsPouringTipClass> findAll() {
        return null;
    }
    
}
