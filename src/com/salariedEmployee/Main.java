package com.salariedEmployee;

public class Main {
    public static <BasePlusEmployee> void main(String[] args) {
        Employee employee= new Employee ( "Shishonah","Posey","f55006");
        SalariedEmployee salariedEmployee= new SalariedEmployee ( 300 );
        BasePlusEmployee basePlusEmployee = new BasePlusEmployee ( 200.000,18.00);


        System.out.println( basePlusEmployee);
        System.out.println(salariedEmployee);
        System.out.println(employee);
    }
    }
