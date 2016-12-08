/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tryAndFitv1.session;

import com.tryAndFitv1.entity.Form;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author amir.zidi
 */
@Local
public interface FormFacadeLocal {

    void create(Form form);

    void edit(Form form);

    void remove(Form form);

    Form find(Object id);

    List<Form> findAll();

    List<Form> findRange(int[] range);

    int count();
    
}
