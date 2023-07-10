package com.bridgelabz.employeemanagement3;
import java.util.*;
public class EmployeeManagement3 {
    //UC4
    /*Solving using
Switch Case
Statement*/
    static final int wagePerHour=20;
    static final int fullDayHours=8;
    static final int partTimeHours=4;
    static int dailyWage=0;
    public static void main(String[] args) {
        System.out.println("Welcome to employee management using classes, version - 3.");
        Random random=new Random();
        int attendance = random.nextInt(3);

        switch (attendance){
            case 0:
                System.out.println("Employee is absent.");
                dailyWage=0;
                break;
            case 1:
                System.out.println("Employee is present full-time.");
                dailyWage=fullDayHours*wagePerHour;
                break;
            case 2:
                System.out.println("Employee is present part-time.");
                dailyWage=partTimeHours*wagePerHour;
                break;
        }

        System.out.println("Daily wage: "+ dailyWage);

    }
}
