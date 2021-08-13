package com.company;

import java.util.Scanner;

public class Main {

public static Scanner input = new Scanner ( System.in );

    public static void main(String[] args) {
//
//        //Part 1`
//        System.out.print("Please Enter Name: ");
//        String name = input.nextLine ();
//
//        System.out.println ("Hello " + name);
//        //----------------------------------

        //Part 2
        boolean check = true;

        System.out.println ( "Welcome to Manny's CLI" );

    while (check){
        System.out.println ( "Please Choose an option below" );
        System.out.println (
                "1) Say Hello\n" +
                        "2) Reverse a string\n" +
                        "3) Add two numbers\n" +
                        "4) Exit the program" );

        System.out.print ( "Selection: " );
        byte option = input.nextByte ();

        switch (option) {
            case 1 -> {
                Hello.helloUSer ();
            }
            case 2, 3 -> System.out.println ( "Program still in development" );
            case 4 -> {
                check = false;
                System.out.println ( "Bye-Bye! See You Soon" );
            }
            default -> System.out.println ( "Invalid option. Please choose from 1-4." );
        }
    }
    }
}
