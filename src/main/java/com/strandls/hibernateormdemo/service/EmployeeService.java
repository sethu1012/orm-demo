/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strandls.hibernateormdemo.service;

import com.strandls.hibernateormdemo.model.Employee;
import java.util.List;

/**
 *
 * @author sethuraman
 */
public interface EmployeeService {
    
    public Employee addEmployee(Employee employee);
    public List<Employee> getAllEmployees();
    
}
