package com.sample.crud.Entity;

import java.sql.Timestamp;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Employee {

    @NotNull
    public int employeeId;
    public String name;
    public String email;
    public String password;
}
