/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tryAndFitv1.session;

import com.tryAndFitv1.entity.UserResponses;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author amir.zidi
 */
@Local
public interface UserResponsesFacadeLocal {

    void create(UserResponses userResponses);

    void edit(UserResponses userResponses);

    void remove(UserResponses userResponses);

    UserResponses find(Object id);

    List<UserResponses> findAll();

    List<UserResponses> findRange(int[] range);

    int count();
    
}
