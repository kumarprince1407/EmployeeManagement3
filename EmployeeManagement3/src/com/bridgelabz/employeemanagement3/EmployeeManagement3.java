package com.bridgelabz.employeemanagement3;
import java.util.*;
public class EmployeeManagement3 {
    //UC5
    /*Calculate Wages till
a condition of total
working hours or
days is reached for
a month - Assume 100 hours and 20 days*/
    static final int wagePerHour=20;
    static final int fullDayHours=8;
    static final int partTimeHours=4;
    static final int maxWorkingDays=20;
    static int totalWorkingDays=0;
    static int monthlyWage=0;
    static int dailyWage=0;
    static int totalWorkingHours=0;
    static final int maxWorkingHours=100;
    static int workingHours=0;
    public static void main(String[] args) {
        System.out.println("Welcome to employee management using classes, version - 3.");
        Random random = new Random();

        while (totalWorkingDays<maxWorkingDays || totalWorkingHours<maxWorkingHours) {
            int attendance = random.nextInt(3);
            switch (attendance) {
                case 0:
                    System.out.println("Employee is absent.");
                    dailyWage = 0;
                    workingHours=0;
                    break;
                case 1:
                    System.out.println("Employee is present full-time.");
                    workingHours=fullDayHours;
                    dailyWage = workingHours * wagePerHour;
                    break;
                case 2:
                    System.out.println(" Employee is present part-time.");
                    workingHours=partTimeHours;
                    dailyWage = workingHours * wagePerHour;
                    System.out.println("Daily wage: " + dailyWage);
                    break;
            }
            System.out.println("Daily wage: " + dailyWage);
            monthlyWage+=dailyWage;
            totalWorkingHours+=workingHours;
            totalWorkingDays++;

        }
        System.out.println("Total working hours: "+ totalWorkingHours);
        System.out.println("Monthly salary: "+ monthlyWage);


    }
}
