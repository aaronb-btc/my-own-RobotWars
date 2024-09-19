package com.btcag.bootcamp;

import java.util.Scanner;

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
        GeneratePlayfield playfield_generator = new GeneratePlayfield();
        long[] playerPos = new long[] {0, 0};
        playfield_generator.main(6, 5, myAvatar, playerPos);
    }
}