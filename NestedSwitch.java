package com.switchDemo;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int empID=in.nextInt();
        String department=in.next();

        switch(empID){
            case 1:
                System.out.println("employee 1");
                break;
            case 2:
                System.out.println("employee 2");
            case 3:
                switch (department){
                    case "IT":
                        System.out.println("IT Dept.");
                        break;
                    case "Operations":
                        System.out.println("Operations department");
                        break;
                    default:
                        System.out.println("Please select for department that exists");
                        break;
                }
                break;
            default:
                System.out.println("Employee doesn't exist");
                break;
        }

    }
}
