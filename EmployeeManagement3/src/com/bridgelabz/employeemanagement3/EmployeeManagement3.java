package com.bridgelabz.employeemanagement3;
import java.util.*;
public class EmployeeManagement3 {
    //UC3
    /*Add Part time
Employee & Wage
- Assume Part time Hour is 8*/
    static final int wagePerHour=20;
    static final int fullDayHours=8;
    static final int partTimeHours=4;
    static int dailyWage=0;
    public static void main(String[] args) {
        System.out.println("Welcome to employee management using classes, version - 3.");
        Random random=new Random();
        int attendance = random.nextInt(3);
        dailyWage=wagePerHour*fullDayHours;
        if(attendance==1){
        System.out.println("The employee is present full-time.");
            dailyWage=wagePerHour*fullDayHours;
    }else if(attendance==2){
            System.out.println("The employee is present part-time.");
            dailyWage=wagePerHour*partTimeHours;
        }
        else{
            System.out.println("Employee is absent.");
            dailyWage=0;
        }
        System.out.println("Daily wage: "+ dailyWage);

    }
}
