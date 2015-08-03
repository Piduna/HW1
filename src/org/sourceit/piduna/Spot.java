package org.sourceit.piduna;

/**
 * Created by Valeriu on 03.08.2015.
 */
public class Spot {
    public String name;
    public String says;

    public void wname(){
        System.out.println("Come to me " + name);
    }
    public void wdoing(){
        System.out.println("Bark: " + says);
    }
}
