/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tryAndFitv1.session;

import com.tryAndFitv1.entity.BusinessUnit;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author amir.zidi
 */
@Local
public interface BusinessUnitFacadeLocal {

    void create(BusinessUnit businessUnit);

    void edit(BusinessUnit businessUnit);

    void remove(BusinessUnit businessUnit);

    BusinessUnit find(Object id);

    List<BusinessUnit> findAll();

    List<BusinessUnit> findRange(int[] range);

    int count();
    
}
