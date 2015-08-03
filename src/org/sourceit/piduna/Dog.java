package org.sourceit.piduna;

/**
 * Created by Valeriu on 03.08.2015.
 */
public class Dog {

    public static void main(String[] args) {

        Scruffy scruffy = new Scruffy();
        scruffy.name = "Scruffy";
        scruffy.says = "Ruff!";
        scruffy.wname();
        scruffy.wdoing();

        Spot spot = new Spot ();
        spot.name = "Spot";
        spot.says = "Wurf!";
        spot.wname();
        spot.wdoing();

    }
}
