package com.bridgelabz.employeemanagement3;
import java.util.*;
public class EmployeeManagement3 {
    //UC7
    /*Compute Employee Wage
for multiple companies - Note: Each Company has its own
wage, number of working days
and working hours per month
- Use Class Method with function
parameters instead of Class
Variables*/
    public static void computeEmployeeWage(String companyName, int wagePerHour, int fullDayHours, int partTimeHours, int maxWorkingDays,int maxWorkingHours){
       int totalWorkingDays=0;
       int totalWorkingHours=0;
       int dailyWage=0;
       int workingHours=0;
       int monthlyWage=0;

        Random random = new Random();

        while (totalWorkingDays<maxWorkingDays && totalWorkingHours<maxWorkingHours) {
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

    public static void main(String[] args) {
        System.out.println("Welcome to employee management using classes, version - 3.");
        // Compute employee wage for Company A
        String companyNameA = "Company A";
        int wagePerHourA = 20;
        int fullDayHoursA = 8;
        int partTimeHoursA = 4;
        int maxWorkingDaysA = 20;
        int maxWorkingHoursA = 100;

        computeEmployeeWage(companyNameA, wagePerHourA, fullDayHoursA, partTimeHoursA, maxWorkingDaysA, maxWorkingHoursA);
        System.out.println("------------------------");

        String companyNameB = "Company B";
        int wagePerHourB = 20;
        int fullDayHoursB = 8;
        int partTimeHoursB = 4;
        int maxWorkingDaysB = 22;
        int maxWorkingHoursB = 120;
        System.out.println(companyNameB);
        computeEmployeeWage(companyNameB,wagePerHourB,fullDayHoursB,partTimeHoursB,maxWorkingDaysB,maxWorkingHoursB);

    }
}
