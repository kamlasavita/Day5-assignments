package com.bridgelabz.review1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter the year :: ");
        Scanner scan =new Scanner(System.in);
        year = scan.nextInt();

        if (year % 4 == 0) {
            System.out.println(year + " Year is leap year");
        }else {
            System.out.println(year + " Year is not leap year");
        }
    }
}
