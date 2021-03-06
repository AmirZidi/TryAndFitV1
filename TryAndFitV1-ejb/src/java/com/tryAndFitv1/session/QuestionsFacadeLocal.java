/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tryAndFitv1.session;

import com.tryAndFitv1.entity.Questions;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author amir.zidi
 */
@Local
public interface QuestionsFacadeLocal {

    void create(Questions questions);

    void edit(Questions questions);

    void remove(Questions questions);

    Questions find(Object id);

    List<Questions> findAll();

    List<Questions> findRange(int[] range);

    int count();
    
}
