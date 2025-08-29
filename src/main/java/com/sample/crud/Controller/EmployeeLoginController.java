package com.sample.crud.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sample.crud.Entity.Employee;
import com.sample.crud.Service.EmployeeService;



@RestController
public class EmployeeLoginController {

    @Autowired
    EmployeeService employeeService;

    //Adding new employee with the details
    @PostMapping("/signup")
    public int employeeLogin(@RequestBody Employee employee) {
       return employeeService.addNewEmployee(employee);
    }


    //Checking the password and email and allowing employee to login in simple way
    @GetMapping("/signin")
    public Employee getMethodName(@RequestParam String email,@RequestParam String password) {
        System.out.println(email);
        return employeeService.employeeLogin(email,password);
    }
    
}
