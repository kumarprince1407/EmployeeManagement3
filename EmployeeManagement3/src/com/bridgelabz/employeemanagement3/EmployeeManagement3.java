package com.bridgelabz.employeemanagement3;
import java.util.*;
public class EmployeeManagement3 {
    //UC2
    /*Calculate Daily
Employee Wage - Assume Wage per Hour is 20 - Assume Full Day Hour is 8*/
    static final int wagePerHour=20;
    static final int fulldayHours=8;
    static int dailyWage=0;
    public static void main(String[] args) {
        System.out.println("Welcome to employee management using classes, version - 3.");
        Random random=new Random();
        int attendance = random.nextInt(2);
        dailyWage=wagePerHour*fulldayHours;
        if(attendance==1){
        System.out.println("The employee is present.");
            dailyWage=wagePerHour*fulldayHours;
    }else{
            System.out.println("The employee is absent.");
            dailyWage=0;
        }
        System.out.println("Daily wage: "+ dailyWage);

    }
}
