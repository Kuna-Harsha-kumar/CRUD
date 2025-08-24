package com.sample.crud.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.crud.Entity.CrudEntity;
import com.sample.crud.Mapper.CrudOperations;

@Service
public class CrudOperationsService {

    @Autowired
    public CrudOperations crudOperations;
    
    public List<CrudEntity> getalltheEmployeeList(){
       return crudOperations.employeeList();
    }

    public int enterNewEmployee(CrudEntity employeeList){
        return crudOperations.enterDetails(employeeList);
    }

    public int updateSalary(int salary,int employeeId){
        return crudOperations.updateSalary(salary, employeeId);
    }
    public int deleteEmployee(int employeeId){
        return crudOperations.deleteEmployee(employeeId);
    }
}
