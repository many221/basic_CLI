package com.company;

public class Option3 {

    public static void addTwo(){
        System.out.print ("Enter First Number: ");
        int num1 = Main.input.nextInt ();
        System.out.print ("Enter Second Number: ");
        int num2 = Main.input.nextInt ();

        int sum = num1 + num2;

        System.out.println ("The Sum of "+num1 + " + "+ num2 + " is " + sum);
    }
}
