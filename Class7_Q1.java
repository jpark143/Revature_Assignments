package com.company.Assignment;

import java.util.Scanner;

public class Class7_Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ask user to enter the length of rectangle
        System.out.println("Enter the length: ");
        double length = scanner.nextDouble();

        // ask user to enter the breadth of rectangle
        System.out.println("Enter the breadth: ");
        double breadth = scanner.nextDouble();

        // find the area of the rectangle
        int area = (int) (length * breadth);
        // print out the area of rectangle in int type
        System.out.println("The area of rectangle: " + area);

        // print out the area of rectangle in double type
        double aread = length * breadth;
        System.out.println("Area in double: " + aread);

    }
}
