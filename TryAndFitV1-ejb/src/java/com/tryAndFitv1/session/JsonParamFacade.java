/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tryAndFitv1.session;

import com.tryAndFitv1.entity.JsonParam;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author amir.zidi
 */
@Stateless
public class JsonParamFacade extends AbstractFacade<JsonParam> implements JsonParamFacadeLocal {

    @PersistenceContext(unitName = "TryAndFitV1-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public JsonParamFacade() {
        super(JsonParam.class);
    }
    
}
