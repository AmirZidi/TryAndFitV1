/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tryAndFitv1.session;

import com.tryAndFitv1.entity.JsonParam;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author amir.zidi
 */
@Local
public interface JsonParamFacadeLocal {

    void create(JsonParam jsonParam);

    void edit(JsonParam jsonParam);

    void remove(JsonParam jsonParam);

    JsonParam find(Object id);

    List<JsonParam> findAll();

    List<JsonParam> findRange(int[] range);

    int count();
    
}
