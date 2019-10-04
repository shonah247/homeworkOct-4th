package com.salariedEmployee;

public class SalariedEmployee extends Employee{

    protected int  weeklySalary;

    public SalariedEmployee(int weeklySalary){
        super("Shishonah", "Posey","f55006");
        this.weeklySalary = weeklySalary;
    }

    public SalariedEmployee(int firstName, int lastName, int employeeID) {
        super ();
    }

    @Override
    public void payCheck() {

        System.out.println (weeklySalary);
    }
}
