package com.sample.crud.Entity;

import org.springframework.data.annotation.Id;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Employee {

    @Id
    @NotNull
    public int employeeId;
    public String name;
    public String email;
    public String password;
    
}
