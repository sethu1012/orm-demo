/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strandls.hibernateormdemo.service.impl;

import com.strandls.hibernateormdemo.dao.EmployeeDAO;
import com.strandls.hibernateormdemo.model.Employee;
import com.strandls.hibernateormdemo.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 *
 * @author sethuraman
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    
    private final EmployeeDAO dao;
    
    public EmployeeServiceImpl(EmployeeDAO dao) {
        this.dao = dao;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return this.dao.save(employee);
    }
    
}
