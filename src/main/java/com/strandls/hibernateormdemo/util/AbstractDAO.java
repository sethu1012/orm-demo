/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strandls.hibernateormdemo.util;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import org.hibernate.SessionFactory;

/**
 *
 * @author sethuraman
 */
public abstract class AbstractDAO<T, K extends Serializable> {

    protected SessionFactory sessionFactory;

    protected Class<? extends T> daoType;

    public AbstractDAO(SessionFactory sessionFactory) {
        daoType = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        this.sessionFactory = sessionFactory;
    }

}
