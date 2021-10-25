package com.company.Assignment;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Starting Calculator App!");
        System.out.println("Enter Your First Number");
        int fnum = scanner.nextInt();

        System.out.println("Enter Your Last Number");
        int snum = scanner.nextInt();

        System.out.println("Select what to do with the numbers");
        System.out.println("Press 1 to add" + "\n" +
                "Press 2 to Subtract" + "\n" +
                "Press 3 to Multiply" + "\n" +
                "Press 4 to Divide");
        int optNum = scanner.nextInt();
        if (optNum == 1){
            System.out.println("Result: " + fnum + " + " + snum + " = " + (fnum + snum));
        }
        else if (optNum == 2){
            System.out.println("Result: " + fnum + " - " + snum + " = " + (fnum - snum));
        }
        else if (optNum == 3){
            System.out.println("Result: " + fnum + " * " + snum + " = " + (fnum * snum));
        }
        else if (optNum == 4){
            System.out.println("Result: " + fnum + " / " + snum + " = " + (fnum / snum));
        }
        else{
            System.out.println("Please choose the correct option...");
        }
    }
}
