/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strandls.hibernateormdemo.controller;

import com.strandls.hibernateormdemo.dto.EmployeeDTO;
import com.strandls.hibernateormdemo.model.Department;
import com.strandls.hibernateormdemo.model.Employee;
import com.strandls.hibernateormdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sethuraman
 */
@RequestMapping("/")
@RestController
public class EmployeeController {
    
    @Autowired
    private EmployeeService service;
    
    @PostMapping("/add")
    public ResponseEntity addEmployee(@RequestBody EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setName(employeeDTO.getEmployeeName());
        employee.setDepartment(new Department(employeeDTO.getDepartment()));
        employee = this.service.addEmployee(employee);
        return new ResponseEntity(employee, HttpStatus.CREATED);
    }
    
}
