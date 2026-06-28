package com.john.assignment;

import java.util.Scanner;

public class AverageWithholding {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double weeklyIncome;
        double taxRate;
        double withholding;

        System.out.print("Enter your weekly income: $");
        weeklyIncome = input.nextDouble();

        if (weeklyIncome < 500) {
            taxRate = 0.10;
        } else if (weeklyIncome >= 500 && weeklyIncome < 1500) {
            taxRate = 0.15;
        } else if (weeklyIncome >= 1500 && weeklyIncome < 2500) {
            taxRate = 0.20;
        } else {
            taxRate = 0.30;
        }

        withholding = weeklyIncome * taxRate;

        System.out.println();
        System.out.println("Weekly Income: $" + weeklyIncome);
        System.out.println("Tax Rate: " + (taxRate * 100) + "%");
        System.out.println("Weekly Tax Withholding: $" + withholding);

        input.close();
    }
}