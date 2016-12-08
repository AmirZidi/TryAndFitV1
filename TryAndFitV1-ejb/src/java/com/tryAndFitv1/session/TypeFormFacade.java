/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tryAndFitv1.session;

import com.tryAndFitv1.entity.TypeForm;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author amir.zidi
 */
@Stateless
public class TypeFormFacade extends AbstractFacade<TypeForm> implements TypeFormFacadeLocal {

    @PersistenceContext(unitName = "TryAndFitV1-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TypeFormFacade() {
        super(TypeForm.class);
    }
    
}
