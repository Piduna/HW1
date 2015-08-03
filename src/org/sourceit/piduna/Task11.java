package org.sourceit.piduna;

import java.util.Scanner;

/**
 * Created by Valeriu on 03.08.2015.
 */
public class Task11 {
    public static void main(String[] args){

        double a,b,c,d,x1,x2;

        //Input in console by user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a: ");
        //Double.parseDouble(scanner.nextLine()) for non-integer symbols
        a = Double.parseDouble(scanner.nextLine());
        System.out.print("Please input b: ");
        b = Double.parseDouble(scanner.nextLine());
        System.out.print("Please input c: ");
        c = Double.parseDouble(scanner.nextLine());

        //a = 2.1;
        //b = 6;
        //c = 3;

        d = ((b*b)-4*a*c);

        if (d == 0){
            x1 = -1 * (b/(2*a));
            System.out.println("d = " + d);
            System.out.println("x1 = " + x1);
        } else if (d > 0) {
            x1 = ((-1 * b) + (Math.sqrt(d))) / (2 * a);
            x2 = ((-1 * b) - (Math.sqrt(d))) / (2 * a);
            System.out.println("d = " + d);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        else {
            System.out.println("d = " + d);
            System.out.println("Without x1 and x2");
        }

    }
}
