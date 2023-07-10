package com.bridgelabz.employeemanagement3;
import java.util.*;
public class EmployeeManagement3 {
    //UC5
    /*Calculating Wages
for a Month
- Assume 20 Working Day per Month*/
    static final int wagePerHour=20;
    static final int fullDayHours=8;
    static final int partTimeHours=4;
    static final int maxWorkingDays=20;
    static int totalWorkingDays=0;
    static int monthlyWage=0;
    static int dailyWage=0;
    public static void main(String[] args) {
        System.out.println("Welcome to employee management using classes, version - 3.");
        Random random = new Random();

        while (totalWorkingDays<maxWorkingDays) {
            int attendance = random.nextInt(3);
            switch (attendance) {
                case 0:
                    System.out.println("Employee is absent.");
                    dailyWage = 0;
                    break;
                case 1:
                    System.out.println("Employee is present full-time.");
                    dailyWage = fullDayHours * wagePerHour;
                    break;
                case 2:
                    System.out.println(" Employee is present part-time.");
                    dailyWage = partTimeHours * wagePerHour;
                    System.out.println("Daily wage: " + dailyWage);
                    break;
            }
            System.out.println("Daily wage: " + dailyWage);
            monthlyWage+=dailyWage;
            totalWorkingDays++;

        }
        System.out.println("Monthly salary: "+ monthlyWage);


    }
}
