package com.btcag.bootcamp;

public class GeneratePlayfield {
    public static void main(long width, long height, char robot, long[] robotPos) {
        for (long y = 0; y < height; y++) {
            for (long x = 0; x < width * 4; x++) {
                System.out.print("-");
            }
            System.out.println('-');
            for (long x = 0; x < width; x++) {
                System.out.print("| ");
                if (x == robotPos[0] && y == robotPos[0]) {
                    System.out.print(robot);
                } else {
                    System.out.print(' ');
                }
                System.out.print(' ');
            }
            System.out.println('|');
        }
        for (long x = 0; x < width * 4 + 1; x++) {
            System.out.print('-');
        }
    }
}