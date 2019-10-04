package com.salariedEmployee;

public class basePlusEmployee extends commisionedEmployee {

    double baseSalary;

    public basePlusEmployee(double baseSalary) {
        super (200.00,18.75);
        this.baseSalary = baseSalary;
    }

    public basePlusEmployee(int grossSales, int commissionRate) {
        super ( grossSales, commissionRate );
    }

    public basePlusEmployee(int firstName, int lastName, int employeeID) {
        super ( firstName, lastName, employeeID );
    }

    public basePlusEmployee(double v, double v1) {
        super ();
    }

    @Override
    public double payCheck(double commissonRate, double  grossSales) {
        return  commissionRate * grossSales +  baseSalary;
    }
}
