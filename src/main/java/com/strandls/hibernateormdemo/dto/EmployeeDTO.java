/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strandls.hibernateormdemo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author sethuraman
 */
@NoArgsConstructor
@Setter
@Getter
public class EmployeeDTO {
    
    private String employeeName;
    private Long department;
    
}
