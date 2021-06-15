package com.example.assignment3;

public class Employee {
    String Name;
    String City;

    public  Employee(String EmployeeName,String EmployeeCity) {

        Name = EmployeeName;
        City=EmployeeCity;

    }

    public String getName() {
        return Name;
    }

    public void setName(String EmployeeName) {
        Name = EmployeeName;
    }

    public String getCity() {
        return City;

    }

    public void setCity(String EmployeeCity) {
        City = EmployeeCity;
    }
}

