/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tryAndFitv1.session;

import com.tryAndFitv1.entity.FormContent;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author amir.zidi
 */
@Local
public interface FormContentFacadeLocal {

    void create(FormContent formContent);

    void edit(FormContent formContent);

    void remove(FormContent formContent);

    FormContent find(Object id);

    List<FormContent> findAll();

    List<FormContent> findRange(int[] range);

    int count();
    
}
