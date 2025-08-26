package com.sample.crud.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.crud.Entity.Employee;
import com.sample.crud.Mapper.EmployeeMapper;

@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    public int addNewEmployee(Employee employee){
        return employeeMapper.addNewEmployee(employee);
    }
}
