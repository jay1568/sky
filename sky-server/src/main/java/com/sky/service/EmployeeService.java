package com.sky.service;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.entity.Employee;
import org.springframework.beans.BeanUtils;


public interface EmployeeService {

    void save(EmployeeDTO employeeDTO);

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

}
