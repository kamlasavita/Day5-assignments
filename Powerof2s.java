package com.bridgelabz.review1;

public class Powerof2s {
    public static void main(String[] args) {
        int numPowers = 10;
        int power = 1;

        for (int i =0; i  < numPowers; i++) {
            System.out.println("2^" + i + " = " + power);
            power *= 2;
        }
    }
}
