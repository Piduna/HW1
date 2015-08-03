package org.sourceit.piduna;

import java.util.Scanner;

/**
 * Created by Valeriu on 03.08.2015.
 */
public class Task7 {
    public static void main(String[] args){


        //Input in console by user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input number: ");
        int t = scanner.nextInt();

        //int t = 14;
        int m = t;
        int sum = 0;

        //t>0. when we have 0, cycle become end. because number of int are finished
        while (t>0) {
            //every right. example int 123: first cycle, we have 3, next cycle we have 2, in finish we have 1.
            sum = sum + t % 10;
            //every left. example int int 123: first cycle 12, next cycle we have 1, in finish we have 0.
            //when we have 0 – cycle become end. in sum – we have 3+2+1.
            t = t / 10;
        }

        if(m<=99) {
            System.out.println(sum);
        } else {
            System.out.println("bad");
        }

    }
}
