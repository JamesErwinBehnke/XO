package programming111;

import java.util.Scanner;
/**
 * Write a description of class XO here.
 * 
 * JAMES BEHNKE 
 * FRI OCT 9 2016
 */
public class XO
{
    public static void main (String[] args) {
        // instance variables - replace the example below with your own
        String v1;
        int v2;

        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to insert an X or an O?");

        v1 = input.next();

        System.out.println("How big do you want it?");
        v2 = input.nextInt();

        if(v1.equals("x")) {

            for(int row = 0 ; row < v2; row++) {
                for(int col=0 ; col < v2 ; col++) {
                    if(col==(row)) {
                        System.out.print("*");

                    } else if (v2 - 1 - row == col) {
                        System.out.print("*");

                    } else 
                        System.out.print(" ");			

                }
                System.out.println();
            }
        } else if (v1.equals("o")) {
            for(int row = 0; row < v2; row++) {
                for (int col = 0; col < v2 ; col++) {
                    if (row == 0) {
                        System.out.print("*");

                    }else if (col==0) {
                        System.out.print("*");

                    } else if (row==(v2-1)) {
                        System.out.print("*");

                    } else if (col==(v2-1)) {

                        System.out.print("*");

                    } else {
                        System.out.print(" ");

                    }
                   
                }
                 System.out.println();
            }
        }
    }
}

