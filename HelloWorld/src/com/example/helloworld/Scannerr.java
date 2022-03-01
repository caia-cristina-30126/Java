package com.example.helloworld;
import java.util.Scanner;

public class Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);

    }
}

