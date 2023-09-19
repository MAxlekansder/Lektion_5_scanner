package com.AlexanderHasslund.scanner;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //instansierad scanner
        /*Scanner scan = new Scanner(System.in);

        //System.out.println("dwdw");
        //String save = scan.nextLine();
        //System.out.println("du skrev: " + save);

        String scan2 = new Scanner(System.in).nextLine();
        System.out.println(scan2);


        while(true) {
            scannerMain();
            return; // <-- slänger ut oss själva när metoden är klar alt kodstycket
            //break; <-- blir samma sak som return
        }

     */

        boolean isPlaying = true;
        /*
        do {

            //vi måste tilldela resultatet från metoden om vi retunerar den
            String result = scannerMain();

            //kan även använda dig av objektets funktion "."
            //if (result.equals("hi) --> gå visdare
            //(Objects.equals(result, "hi") --> gå vidare
            if (result.equals("hi")) {
                System.out.println("its true");
            } else {
                System.out.println("det var fel resultat");
                isPlaying = false;
            }

        } while (isPlaying);

         */
        do {
            int result = scannerNumber();

            for (int i = 0; i < result; i++) {
                System.out.println(i);
                System.out.println("såhär många gånger");

            }

            if (result > 1000) {
                isPlaying = false;
            }


        } while (isPlaying);

    }

    //helst vill man bryta ut metoder
    public static String scannerMain() {
        //static ska inte finnas med om det finns i en annan klass
        //scan = objekt
        Scanner scan = new Scanner(System.in);

        System.out.println("Insert some sentence");
        String input = scan.nextLine();

        return input;
    }

    public static int scannerNumber() {

        Scanner scan = new Scanner(System.in);
        System.out.println("please insert a number");

        return scan.nextInt();
    }
}

