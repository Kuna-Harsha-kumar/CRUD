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
        System.out.println(employee.getEmail());
        return employeeMapper.addNewEmployee(employee);
    }
    public Employee employeeLogin(String email,String password){
        Employee employee=employeeMapper.employeeLogin(email);
        System.out.println(employee.getEmail());
        if (employee.getEmail().equalsIgnoreCase(email) && employee.getPassword().equals(password)){
        return employee;
    }else{
        return employee;
    }
}
}
