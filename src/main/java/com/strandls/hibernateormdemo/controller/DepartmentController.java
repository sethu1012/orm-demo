/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strandls.hibernateormdemo.controller;

import com.strandls.hibernateormdemo.model.Department;
import com.strandls.hibernateormdemo.service.DepartmentService;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sethuraman
 */
@RequestMapping("/")
@RestController
public class DepartmentController {
    
    @Autowired
    private DepartmentService service;
    
    @GetMapping("/departments")
    public ResponseEntity getDepartments() {
        return new ResponseEntity(this.service.getAllDepartments(), HttpStatus.OK);
    }
    
}
