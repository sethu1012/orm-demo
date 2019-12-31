/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strandls.hibernateormdemo.dao;

import com.strandls.hibernateormdemo.model.Department;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sethuraman
 */
public interface DepartmentDAO {
    List<Department> getAllDepartments();
    Department getDepartment(Long id);
}
