/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strandls.hibernateormdemo.dao.impl;

import com.strandls.hibernateormdemo.dao.DepartmentDAO;
import com.strandls.hibernateormdemo.model.Department;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sethuraman
 */
@Repository
@Transactional
public class DepartmentDAOImpl implements DepartmentDAO {
    
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Department> getAllDepartments() {
        Query query = this.entityManager.createQuery("from Department");
        return (List<Department>) query.getResultList();
    }

    @Override
    public Department getDepartment(Long id) {
        Query query = this.entityManager.createQuery("from Department d where d.id = :id");
        query.setParameter("id", id);
        return (Department) query.getSingleResult() ;
    }
    
}
