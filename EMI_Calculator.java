package com.company.Assignment;

import java.util.Scanner;

public class EMI_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Starting EMI Calculator App!");
        System.out.println("Enter the Load Amount:");
        int loan = scanner.nextInt();

        System.out.println("Enter the % Rate of Interest:");
        float roi = scanner.nextFloat();
        roi = roi/(12*100);

        System.out.println("Enter the length of time in months (Tenure): ");
        int tenure = scanner.nextInt();

        double emi = (loan * roi * (Math.pow(1+roi,tenure)) / (Math.pow(1+roi, tenure)-1));
        System.out.println("Output EMI: " + emi);

    }
}
