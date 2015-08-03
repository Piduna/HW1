package org.sourceit.piduna;

import java.util.Scanner;

/**
 * Created by Valeriu on 03.08.2015.
 */
public class Task10 {
    public static void main(String[] args){

        double  a, b, s, c, c2, p;

        //Input in console by user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a: ");
        //Double.parseDouble(scanner.nextLine()) for non-integer symbols
        a = Double.parseDouble(scanner.nextLine());
        System.out.print("Please input b: ");
        b = Double.parseDouble(scanner.nextLine());

        //a = 10.3;
        //b = 12.5;
        s = (a*b)/2;
        c2 = ((a*a) + (b*b));
        c = Math.sqrt(c2);
        p = a + b + c;

        System.out.println("c = " + c);
        System.out.println("s = " + s);
        System.out.println("p = " + p);

    }
}
