package com.btcag.bootcamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String username = scanner.next();
        System.out.println("Welcome, " + username  + "!");
        GeneratePlayfield playfield_generator = new GeneratePlayfield();
        playfield_generator.main();
    }
}