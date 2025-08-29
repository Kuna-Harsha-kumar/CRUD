CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY AUTO_INCREMENT,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    Email VARCHAR(100),
    Salary DECIMAL(10,2),
    Department VARCHAR(50)
);


-- Insert a single record
INSERT INTO Employees (FirstName, LastName, Email, Salary, Department)
VALUES ('John', 'Doe', 'john.doe@example.com', 60000, 'IT');

-- Insert multiple records
INSERT INTO Employees (FirstName, LastName, Email, Salary, Department)
VALUES 
('Jane', 'Smith', 'jane.smith@example.com', 75000, 'HR'),
('Alice', 'Johnson', 'alice.johnson@example.com', 80000, 'Finance');

select * from Employees



create table employeeLogin(
       EmployeeID INT PRIMARY KEY AUTO_INCREMENT,
       Name varchar(50),
       Email varchar(50),
       Password varchar(50),
       LastLogin Timestamp
);

select * from employeeLogin el

INSERT INTO employeeLogin (Name, Email, Password, LastLogin)
VALUES ('John Doe', 'john@test.com', '12345', CURRENT_TIMESTAMP);


Select * from employeeLogin where email="New";

ALTER TABLE employeeLogin AUTO_INCREMENT = 1;


delete from employeeLogin;
select * from employeeLogin el 