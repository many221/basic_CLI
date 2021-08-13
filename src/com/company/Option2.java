package com.company;

public class Option2 {
    public static void rev(){

        System.out.print ("Please Enter A String: ");
        String op = Main.input.next();
        String po = "";
        for (int i = op.length () - 1; i >= 0; i--) {
            po += op.charAt ( i );
        }
        System.out.println (po);
    }
}
