package com.salariedEmployee;

public class commisionedEmployee extends Employee {
    double grossSales;
    double commissionRate;

    public commisionedEmployee(double  grossSales, double commissionRate){
        super("Shishonah","Posey","");
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;

    }

    public commisionedEmployee(int firstName, int lastName, int employeeID) {
        super ( );
    }

    public commisionedEmployee(double v) {
        super ();
    }

    public commisionedEmployee() {
        super ("Shishonah","Posey","f55006");
    }


    @Override
    public double payCheck (double commissionRate,double grossSales){
        return grossSales*commissionRate;

    }

    public commisionedEmployee(char firstName, char lastName, char employeeID) {
        super ( firstName, lastName, employeeID );
    }

    public commisionedEmployee(String imani, String henry, String w397585) {
        super ( imani, henry, w397585 );
    }

    @Override
    public void payCheck() {
        super.payCheck ();
    }
}
