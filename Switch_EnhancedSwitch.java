package com.switchDemo;

import java.util.Scanner;

public class Switch_EnhancedSwitch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter fruit name");
        String fruit= in.next();
        
//Enhanced switch syntax
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("An apple a day keeps doctor away");
            case "Grape" -> System.out.println("small sweet fruit");
            case "Custard" -> System.out.println("best fruit in winter season");
            default -> System.out.println("Please enter fruit exists in list");
        }

        //switch syntax in general or old one

        /* switch (fruit) {
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("An apple a day keeps doctor away");
                break;
            case "Grape":
                System.out.println("small sweet fruit");
                break;
            case "Custard":
                System.out.println("best fruit in winter season");
                break;
            default:
                System.out.println("Please enter fruit exists in list");
                break;
        }

         */
        }
    }
