/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tryAndFitv1.session;

import com.tryAndFitv1.entity.Responses;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author amir.zidi
 */
@Stateless
public class ResponsesFacade extends AbstractFacade<Responses> implements ResponsesFacadeLocal {

    @PersistenceContext(unitName = "TryAndFitV1-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ResponsesFacade() {
        super(Responses.class);
    }
    
}
