/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strandls.hibernateormdemo.service.impl;

import com.strandls.hibernateormdemo.dao.EmployeeDAO;
import com.strandls.hibernateormdemo.model.Employee;
import com.strandls.hibernateormdemo.service.EmployeeService;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author sethuraman
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    
//    private final EmployeeDAO dao;

    @Override
    public Employee addEmployee(Employee employee) {
        return null;
    }
    
    @Override
    public List<Employee> getAllEmployees() {
//        return this.dao.();
        return null;
    }
    
}
