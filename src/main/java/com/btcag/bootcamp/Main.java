package com.btcag.bootcamp;

import java.util.Scanner;

import static com.btcag.bootcamp.GeneratePlayfield.generate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("  ____            _               _    __        __                     \n" +
                " |  _ \\    ___   | |__     ___   | |_  \\ \\      / /   __ _   _ __   ___ \n" +
                " | |_) |  / _ \\  | '_ \\   / _ \\  | __|  \\ \\ /\\ / /   / _` | | '__| / __|\n" +
                " |  _ <  | (_) | | |_) | | (_) | | |_    \\ V  V /   | (_| | | |    \\__ \\\n" +
                " |_| \\_\\  \\___/  |_.__/   \\___/   \\__|    \\_/\\_/     \\__,_| |_|    |___/\n\nEnter your name: ");
        String username = scanner.next();
        System.out.println("Welcome, " + username  + "!\nEnter a character to use as your avatar:");
        char myAvatar = scanner.next().charAt(0);
        long[] playerPos = new long[] {0, 0};
        long[] direction = new long[] {0, 0};
        long[] playfieldSize = new long[] {12, 8};
        boolean running = true;
        while (running) {
            System.out.println(generate(playfieldSize[0], playfieldSize[1], myAvatar, playerPos));
            System.out.println("Wohin willst du dich bewegen?\nW: ↑   A: ←   S: ↓   D: →");
            char input = scanner.next().toLowerCase().charAt(0);
            switch (input) {
                case 'w':
                    direction[0] = 0;
                    direction[1] = -1;
                    break;
                case 'a':
                    direction[0] = -1;
                    direction[1] = 0;
                    break;
                case 's':
                    direction[0] = 0;
                    direction[1] = 1;
                    break;
                case 'd':
                    direction[0] = 1;
                    direction[1] = 0;
                    break;
            }
            playerPos = MovePlayer.movePlayer(direction[0], direction[1], playerPos, playfieldSize);
        }
    }
}

// Test