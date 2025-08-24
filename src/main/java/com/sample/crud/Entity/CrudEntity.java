package com.sample.crud.Entity;



import io.micrometer.common.lang.NonNull;
import lombok.Data;

@Data

public class CrudEntity {

    @NonNull
    public int employeeId;
    public String firstName;
    public String lastName;
    public String email;
    public int salary;
    public String department;

    
}
