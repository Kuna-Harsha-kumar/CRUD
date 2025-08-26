package com.sample.crud.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.sample.crud.Entity.Employee;
import com.sample.crud.Service.EmployeeService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;


@Controller
public class EmployeeLoginController {

    @Autowired
    EmployeeService employeeService;


    @GetMapping("/login")
    public int employeeLogin(@RequestBody Employee employee) {
       return employeeService.addNewEmployee(employee);
    }
    
}
