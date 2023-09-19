package com.AlexanderHasslund.scanner;

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

     do {
         System.out.println("did this run?");
     } while (false);


    }

    //helst vill man bryta ut metoder
    public static void scannerMain() {
        //static ska inte finnas med om det finns i en annan klass
        Scanner scan = new Scanner(System.in);

        System.out.println("Insert some sentence");
        scan.nextLine();

    }
}

