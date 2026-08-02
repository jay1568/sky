package com.sky.service;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;
import org.springframework.beans.BeanUtils;


public interface EmployeeService {

    void save(EmployeeDTO employeeDTO);

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    PageResult pagequery(EmployeePageQueryDTO employeePageQueryDTO);

    void startOrStop(Integer status, long id);
}
