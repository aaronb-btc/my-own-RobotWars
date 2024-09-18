package com.btcag.bootcamp;

public class GeneratePlayfield {
    public static void main() {
        long width = 6;
        long height = 5;
        for (long y = 0; y < height; y++) {
            for (long x = 0; x < width * 4; x++) {
                System.out.print("-");
            }
            System.out.println("-");
            for (long x = 0; x < width; x++) {
                System.out.print("|   ");
            }
            System.out.println("|");
        }
        for (long x = 0; x < width * 4 + 1; x++) {
            System.out.print("-");
        }
    }
}
