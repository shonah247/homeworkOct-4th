package com.salariedEmployee;

public class Employee {
    public char firstName;
    public char lastName;
    private int employeeID;

    public Employee(char firstName, char  lastName, char employeeID){
        this.firstName =firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;

    }

    public Employee() {

    }

    public Employee(String firstName, String lastName, String employeeID) {
    }

    public void payCheck(){


    }
    public double payCheck(double grosssSales, double comissionRate){
        return 0;
    }


    }