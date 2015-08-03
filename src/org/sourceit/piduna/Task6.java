package org.sourceit.piduna;

import java.util.Scanner;

/**
 * Created by Valeriu on 03.08.2015.
 */
public class Task6 {
    public static void main(String[] args) {

        //Input in console by user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input number: ");
        int n = scanner.nextInt();

        // int n = 3;
        if (n % 2 == 0) {
            System.out.println(n + " is even");
        }
        else {
            System.out.println(n + " is odd");
        }
    }
}
