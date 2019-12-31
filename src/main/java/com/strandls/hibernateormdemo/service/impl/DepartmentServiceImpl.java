/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strandls.hibernateormdemo.service.impl;

import com.strandls.hibernateormdemo.dao.DepartmentDAO;
import com.strandls.hibernateormdemo.model.Department;
import com.strandls.hibernateormdemo.service.DepartmentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sethuraman
 */
@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {
    
    @Autowired
    private DepartmentDAO dao;

    @Override
    public List<Department> getAllDepartments() {
        List<Department> departments = this.dao.getAllDepartments();
        return departments;
    }
    
    
}
