package com.company;
import FirstPackage.*;

public class FirstClass {

    public static void main(String[] s) {
        SecondClass two = new SecondClass();
        int i, j;
        for (i = 1; i <= 8; i++) {
            for (j = 1; j <= 8 ; j++) {
                two.aSetter(i);
                two.bSetter(j);
                System.out.println(two.multiplication());
                System.out.println(" ");
            }
            System.out.println();
        }
    }
}
