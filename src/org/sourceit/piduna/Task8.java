package org.sourceit.piduna;

import java.util.Scanner;

/**
 * Created by Valeriu on 03.08.2015.
 */
public class Task8 {
    public static void main(String[] args){

        //Input in console by user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input number: ");
        int n = scanner.nextInt();

        //int n = 10;
        int m = n/2;
        //all int, for -n to n, need int "+" 1, and "-" half of that int.
        //For example, random -5 to 5: (Math.random()*10+1)-5.
        int x = (int)(Math.random()*n+1)-m;
        System.out.println("You random from " + n + " to " + "-"+n + ": " + x);
    }
}
