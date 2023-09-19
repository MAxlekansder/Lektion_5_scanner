package com.AlexanderHasslund.scanner;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Objects
        Scanner scan = new Scanner(System.in);
        Student benny = new Student();

        //Game
        do {

            System.out.println("Input benny's age");
            int result = scan.nextInt();

            benny.age = result;

            System.out.println("You picked: " + result);
            System.out.println("Benny's age is " + benny.age);

        } while (true);
    }
}

