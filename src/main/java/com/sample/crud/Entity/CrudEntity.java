package com.sample.crud.Entity;


import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data

public class CrudEntity {

    @NotNull
    public int employeeId;
    public String firstName;
    public String lastName;
    public String email;
    public int salary;
    public String department;

    
}
