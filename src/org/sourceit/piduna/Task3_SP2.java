package org.sourceit.piduna;

/**
 * Created by Valeriu on 03.08.2015.
 */
public class Task3_SP2 {

    public static void main(String[] args) {
        //start from 1001, becouse first sum, start from 1001. see: 001001
        int start = 1001;
        int end = 1000000;
        int n = 0;
        for (int i = start; i < end; i++){
            int i1=i/100000%10;
            int i2=i/10000%10;
            int i3=i/1000%10;
            int i4=i/100%10;
            int i5=i/10%10;
            int i6=i%10;
            if((i1+i2+i3)==(i4+i5+i6)){
                n++;
            }
        }
        System.out.println("The number of variants: " + n);
    }
}
