package com.sample.crud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.crud.Entity.CrudEntity;
import com.sample.crud.Service.CrudOperationsService;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CrudOperationsController {
    
    @Autowired
    public CrudOperationsService service;

    //This controller method to get all the employee Details
    @GetMapping("/EmployeeList")
    public List<CrudEntity> geEmployeeList(){
        System.out.println(service.getalltheEmployeeList());
        return service.getalltheEmployeeList();
    }

    //This controller method will allow us to add the new employee Details
    @PostMapping("/addNewEmployee")
    public int addNewEmployee(@RequestBody CrudEntity entity) {
        System.out.println(service.enterNewEmployee(entity));
        return service.enterNewEmployee(entity);
    }

    //This method enables to update the details of the employee.In this case we are updating the salary using the employeeId
    @PutMapping("/updateEmployee")
    public int updateEmployeeDetails(@RequestParam int salary, @RequestParam int employeeId) {
        System.out.println(service.updateSalary(salary, employeeId));
        return service.updateSalary(salary, employeeId);
    }
    
    //This method is to delete the employees (Hard delete).Deleting from the database
    @DeleteMapping("/DeleteEmployee")
    public int deleteEmployee(@RequestParam int employeeId) {
        System.out.println(service.deleteEmployee(employeeId));
        return service.deleteEmployee(employeeId);
    }
    
}
