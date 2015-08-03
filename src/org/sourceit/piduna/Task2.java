package org.sourceit.piduna;

/**
 * Created by Valeriu on 03.08.2015.
 */
public class Task2 {
    public static void main (String[] args){
        int a=1,b=1,fib;
        System.out.println(a);
        System.out.println(b);
        //cycle from 3, bcouse we have, 1 1 2. next state is it 3.
        for(int i=3;i<=11;i++){
            //fib=a+b. 1+1
            fib=a+b;
            //1=1. show, that a = b.
            a=b;
            //for increase. show, that cycle have increase, and b after a
            b=fib;
            System.out.println(fib);

        }
    }
}
