/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.manyalcoholclasses.model;

import com.mycompany.manyalcoholclasses.service.crud.BeerPouringTipCrudService;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import static org.mockito.Mockito.when;

/**
 *
 * @author Bradz
 */
public class BeerPouringTipNewTest {
    @Mock
    BeerPouringTipCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(BeerPouringTipCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
        BeerPouringTipClass q1 = new BeerPouringTipClass.Builder("Always keep the beer cold").id("1").build();
        BeerPouringTipClass returnQuestion = crudService.persist(q1);
        when(crudService.persist(q1)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(q1);


    }

    @Test
    public void testRead() throws Exception {
        BeerPouringTipClass q1 = new BeerPouringTipClass.Builder("Always keep the beer cold").id("1").build();
        BeerPouringTipClass returnQuestion = crudService.find(q1.getId());
        when(crudService.find(q1.getId())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(q1.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT
        
        BeerPouringTipClass q1 = new BeerPouringTipClass.Builder("Always keep the beer cold").id("1").build();

        BeerPouringTipClass returnQuestion = crudService.merge(q1);
        when(crudService.merge(q1)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(q1);

    }

    @Test
    public void testDelete() throws Exception {

        BeerPouringTipClass q1 = new BeerPouringTipClass.Builder("Always keep the beer cold").id("1").build();
        BeerPouringTipClass returnQuestion = crudService.remove(q1);
        when(crudService.remove(q1)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(q1);

    }
}
