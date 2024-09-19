package com.btcag.bootcamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String username = scanner.next();
        System.out.println("Welcome, " + username  + "!\nEnter a character to use as your avatar:");
        char myAvatar = scanner.next().charAt(0);
        GeneratePlayfield playfield_generator = new GeneratePlayfield();
        long[] playerPos = new long[] {0, 0};
        playfield_generator.main(6, 5, myAvatar, playerPos);
    }
}