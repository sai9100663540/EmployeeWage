package com.bridgelabz.employeewage;

public class EmpWageComputation {

    void empWageCalculation() {
        int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;
        int empHrs = 0;
        int empWage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 2;

        if (empCheck == IS_FULL_TIME) {
            empHrs = 8;

        } else {
            empHrs = 4;
        }
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("EmpWage: " + empWage);
    }


}

