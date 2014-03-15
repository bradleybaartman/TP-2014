/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.manyalcoholclasses.model;

import com.mycompany.manyalcoholclasses.service.crud.LiquerPouringTipCrudService;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.mockito.Mockito.when;
/**
 *
 * @author Bradz
 */
public class LiquerPourTipNewTest {
    
   @Mock
    LiquerPouringTipCrudService crudService;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(LiquerPouringTipCrudService.class);
    }

    @Test
    public void testCreate() throws Exception {
       LiquerPouringTipClass q1 = new LiquerPouringTipClass.Builder("Always keep the Liquer cold").id("1").build();
       LiquerPouringTipClass returnQuestion = crudService.persist(q1);
        when(crudService.persist(q1)).thenReturn(returnQuestion);
        Mockito.verify(crudService).persist(q1);


    }

    @Test
    public void testRead() throws Exception {
        LiquerPouringTipClass q1 = new LiquerPouringTipClass.Builder("Always keep the Liquer cold").id("1").build();
        LiquerPouringTipClass returnQuestion = crudService.find(q1.getId());
        when(crudService.find(q1.getId())).thenReturn(returnQuestion);
        Mockito.verify(crudService).find(q1.getId());

    }

    @Test
    public void testUpdate() throws Exception {
        // THIS IS THE WRONG WAY TO DO THIS
        // PLEASE FIX FIX FIX
        // LEFT OUT FOR YOU TO FIGURE IT OUT
        
        LiquerPouringTipClass q1 = new LiquerPouringTipClass.Builder("Always keep the Liquer cold").id("1").build();

        LiquerPouringTipClass returnQuestion = crudService.merge(q1);
        when(crudService.merge(q1)).thenReturn(returnQuestion);
        Mockito.verify(crudService).merge(q1);

    }

    @Test
    public void testDelete() throws Exception {

        LiquerPouringTipClass q1 = new LiquerPouringTipClass.Builder("Always keep the Liquer cold").id("1").build();
        LiquerPouringTipClass returnQuestion = crudService.remove(q1);
        when(crudService.remove(q1)).thenReturn(returnQuestion);
        Mockito.verify(crudService).remove(q1);

    }
}
