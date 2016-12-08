/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tryAndFitv1.session;

import com.tryAndFitv1.entity.TypeForm;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author amir.zidi
 */
@Local
public interface TypeFormFacadeLocal {

    void create(TypeForm typeForm);

    void edit(TypeForm typeForm);

    void remove(TypeForm typeForm);

    TypeForm find(Object id);

    List<TypeForm> findAll();

    List<TypeForm> findRange(int[] range);

    int count();
    
}
