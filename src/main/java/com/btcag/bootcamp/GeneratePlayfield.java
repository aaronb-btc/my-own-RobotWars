package com.btcag.bootcamp;

public class GeneratePlayfield {
    public static String generate(long width, long height, char robot, long[] robotPos) {
        String playfield = "";
        char dash = '-';
        char pipe = '|';
        char space = ' ';
        for (long y = 0; y < height; y++) {
            for (long x = 0; x < width * 4 + 1; x++) {
                playfield += dash;
            }
            playfield += '\n';
            for (long x = 0; x < width; x++) {
                playfield += "| ";
                if (x == robotPos[0] && y == robotPos[1]) {
                    playfield += robot;
                } else {
                    playfield += space;
                }
                playfield += space;
            }
            playfield += pipe;
            playfield += '\n';
        }
        for (long x = 0; x < width * 4 + 1; x++) {
            playfield += dash;
        }
        return playfield;
    }
}