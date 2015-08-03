package org.sourceit.piduna;

/**
 * Created by Valeriu on 03.08.2015.
 */
public class Task9 {

    public static void main(String[] args) {

        int n = 155;
        int m = 5;
        int l = n - m;

        //all int, for math.random need "-" first part of that interval
        //and "+" 1. after that, we must "+" first pat of that interval
        //example [5,155]: (Math.random()*150+1)+5
        int x = (int) (Math.random() * l + 1) + m;
        System.out.println("x = " + x);
        if (x >= 25 && x <= 100) {
            System.out.println("x is in interval (25;100)");
        } else {
            System.out.println("x is not in interval (25;100)");
        }

    }
}
