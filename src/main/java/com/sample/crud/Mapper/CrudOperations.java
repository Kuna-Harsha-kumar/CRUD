package com.sample.crud.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.sample.crud.Entity.CrudEntity;

@Mapper
public interface CrudOperations {

    //Seleting all the employees whithout any where condition or specific employee
    @Select("Select * from Employees")
    List<CrudEntity> employeeList();

    //Adding new employee to the database
    @Insert("Insert into Employees(FirstName,LastName,Email,Salary,Department) values (#{firstName},#{lastName},#{email},#{salary},#{department})")
    int enterDetails(CrudEntity crudEntity);

    //updating the specific parameter using where condition for a partifuclar employee
    @Update("Update Employees set salary=#{salary} where employeeId=#{employeeId}")
    int updateSalary(@Param("salary") int salary, @Param("employeeId") int employeeId);

    //Hard deletion of the employee the complete record will be deleted from the database
    @Delete("Delete from Employees where employeeId=#{employeeId}")
    int deleteEmployee(@Param("employeeId") int employeeId);
}
