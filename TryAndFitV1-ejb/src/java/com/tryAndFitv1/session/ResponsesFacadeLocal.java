/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tryAndFitv1.session;

import com.tryAndFitv1.entity.Responses;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author amir.zidi
 */
@Local
public interface ResponsesFacadeLocal {

    void create(Responses responses);

    void edit(Responses responses);

    void remove(Responses responses);

    Responses find(Object id);

    List<Responses> findAll();

    List<Responses> findRange(int[] range);

    int count();
    
}
