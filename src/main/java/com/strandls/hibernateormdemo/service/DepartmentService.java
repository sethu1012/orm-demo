/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strandls.hibernateormdemo.service;

import com.strandls.hibernateormdemo.model.Department;
import java.util.List;
import java.util.Set;

/**
 *
 * @author sethuraman
 */
public interface DepartmentService {
    List<Department> getAllDepartments();
}
