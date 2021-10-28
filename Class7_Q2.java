package com.company.Assignment;

import java.util.Scanner;

public class Class7_Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ask user to enter name
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        // set up the rollNumber
        int rollNumber = 0;
        // try, catch to ask and get roll number
        try{
            System.out.println("Enter your roll number: ");
            // convert string into integer
            rollNumber = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e){
            e.printStackTrace();
        }

        // ask user to enter field of interest
        System.out.println("Enter your field of interest: ");
        String interest = scanner.nextLine();

        // print out format
        String outPut = "Hey, my name is " + name +
                " and my roll number is " + rollNumber +
                ". My field of interest are " + interest +
                ".";

        // print out the result
        System.out.println(outPut);
    }
}
