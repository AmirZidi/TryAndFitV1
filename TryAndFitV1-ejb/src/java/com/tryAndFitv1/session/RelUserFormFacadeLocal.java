/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tryAndFitv1.session;

import com.tryAndFitv1.entity.RelUserForm;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author amir.zidi
 */
@Local
public interface RelUserFormFacadeLocal {

    void create(RelUserForm relUserForm);

    void edit(RelUserForm relUserForm);

    void remove(RelUserForm relUserForm);

    RelUserForm find(Object id);

    List<RelUserForm> findAll();

    List<RelUserForm> findRange(int[] range);

    int count();
    
}
