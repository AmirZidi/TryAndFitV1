/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tryAndFitv1.session;

import com.tryAndFitv1.entity.RelBusinessUnitUsers;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author amir.zidi
 */
@Local
public interface RelBusinessUnitUsersFacadeLocal {

    void create(RelBusinessUnitUsers relBusinessUnitUsers);

    void edit(RelBusinessUnitUsers relBusinessUnitUsers);

    void remove(RelBusinessUnitUsers relBusinessUnitUsers);

    RelBusinessUnitUsers find(Object id);

    List<RelBusinessUnitUsers> findAll();

    List<RelBusinessUnitUsers> findRange(int[] range);

    int count();
    
}
