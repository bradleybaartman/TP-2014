/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.manyalcoholclasses.service.crud.Impl;

import com.mycompany.manyalcoholclasses.model.LiquerPouringTipClass;
import com.mycompany.manyalcoholclasses.service.crud.LiquerPouringTipCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Bradz
 */
public class LiquerPouringTipCrudServiceImpl implements LiquerPouringTipCrudService{
    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public LiquerPouringTipClass find(String s) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public LiquerPouringTipClass persist(LiquerPouringTipClass entity) {

        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public LiquerPouringTipClass merge(LiquerPouringTipClass entity) {
        return null;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public LiquerPouringTipClass remove(LiquerPouringTipClass entity) {
        return  null;
    }

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<LiquerPouringTipClass> findAll() {
        return null;
    }
    
}
