package com.sample.crud.Mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.sample.crud.Entity.Employee;

@Mapper
public interface EmployeeMapper {

    @Insert("insert into employeeLogin(Name,Email,Password,LastLogin) values (#{name},#{email},#{password},current_timestamp)")
    int addNewEmployee(Employee employee);
}
