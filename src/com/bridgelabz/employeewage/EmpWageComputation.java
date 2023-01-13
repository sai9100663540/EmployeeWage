package com.bridgelabz.employeewage;

public class EmpWageComputation {

    void CheckEmpAttendence() {
        int IS_FULL_TIME = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;

        if (empCheck == IS_FULL_TIME)
            System.out.print("Emp is Present ");
        else
            System.out.println("Emp is Absent ");
    }


}

