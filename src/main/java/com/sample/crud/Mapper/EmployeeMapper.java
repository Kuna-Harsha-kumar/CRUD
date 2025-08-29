package com.sample.crud.Mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.sample.crud.Entity.Employee;

@Mapper
public interface EmployeeMapper {

    //adding new employee in a simply way without hashing the password
    @Insert("Insert into employeeLogin (Name,Email,Password,LastLogin) values (#{name},#{email},#{password},current_timestamp)")
    int addNewEmployee(Employee employee);

    
    //logging new employee with the credentials in a simple way
    @Select("Select * from employeeLogin where Email=#{email}")
    Employee employeeLogin(String email);
}
