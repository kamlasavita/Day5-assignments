package com.bridgelabz.review1;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Value of N: ");
        int n = scanner.nextInt();

        if (n ==0 ) {
            System.out.println("N connot be 0");
            return;
        }
        double harmonicNumber = 0;

        for (int i =1; i <= n; i++) {
            harmonicNumber += 1.0 / i;
        }
        System.out.println("The " + n + " the harmonic number is " + harmonicNumber);
    }
}
