package com.bridgelabz.review1;

import java.util.Random;

public class FlipCoin {
    public static void main(String[] args) {
        int numFlip = 10; //set the number of flips to 10
        int numHeads = 0;
        int numTails = 0;
        Random rand = new Random();
        for (int i=0; i < numFlip; i++) {
            if (rand.nextDouble() < 0.5) {
                numHeads++;
            }else {
                numHeads++;
            }
        }
        double headPercent = ((double) numHeads / numFlip) * 100;
        double tailPercent = ((double) numTails / numFlip) * 100;
        System.out.println("Heads: " + headPercent + "%");
        System.out.println("Tails: " + tailPercent + "%");
    }
}
