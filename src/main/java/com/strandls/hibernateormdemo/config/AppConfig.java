/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strandls.hibernateormdemo.config;

import com.strandls.hibernateormdemo.model.Department;
import com.strandls.hibernateormdemo.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 *
 * @author sethuraman
 */
@Configuration
@Lazy
public class AppConfig {
    
    @Bean
    public Department getDepartment() {
        return new Department();
    }
    
    @Bean
    public Employee getEmployee() {
        return new Employee();
    }
    
}
