package org.sourceit.piduna;

/**
 * Created by Valeriu on 03.08.2015.
 */
public class Task3 {
    public static void main(String[] args) {

        int n = 0;
        int n1, n2, n3, n4, n5, n6;
        for(n1=0; n1 < 10; n1++){
            for(n2=0; n2 < 10; n2++){
                for(n3=0; n3 < 10; n3++){
                    for(n4=0; n4 < 10; n4++){
                        for(n5=0; n5 < 10; n5++){
                            for(n6=0; n6 < 10; n6++){
                                if((n1+n2+n3)==(n4+n5+n6))n++;
                            }
                        }
                    }
                }
            }
        }
        //(n-1), because without ticket "000000". if, we put n, result is 55252"
        System.out.println("The number of variants: " + (n - 1));
    }
}
