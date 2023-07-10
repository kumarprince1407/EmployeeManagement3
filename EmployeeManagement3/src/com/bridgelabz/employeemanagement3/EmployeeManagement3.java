package com.bridgelabz.employeemanagement3;
import java.util.*;
public class EmployeeManagement3 {
    //UC1
    public static void main(String[] args) {
        System.out.println("Welcome to employee management using classes, version - 3.");
        Random random=new Random();
        int attendance = random.nextInt(2);
        if(attendance==1){
        System.out.println("The employee is present.");
    }else{
            System.out.println("The employee is absent.");
        }
    }
}
