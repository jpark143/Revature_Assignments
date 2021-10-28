package com.company.Assignment;

import java.util.Scanner;

// class for average
class Average{
    public Average(int num1, int num2, int num3){
        // get average
        double ave =  (num1 + num2 + num3) / 3;
        // print out the average
        System.out.println("The average is: " + ave);
    }

}

public class Class7_Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ask user to enter first number
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        // ask user to enter second number
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        // ask user to enter third number
        System.out.println("Enter third number: ");
        int num3 = scanner.nextInt();

        Average aver = new Average(num1,num2,num3);

    }
}
