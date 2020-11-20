package com.hemebiotech.analytics.core;

import com.hemebiotech.analytics.Main;
import java.util.TreeMap;

/**
 *  Tri alphabériquement le résultat obtenu.
 */
public class OrderSymptoms {

    /**
     *  Tri alphabériquement le résultat obtenu.
     */
    public static void orderSymptoms(){

        Main.symptomsSorted = new TreeMap(Main.results);
        System.out.println("[info] Symptoms sorted alphabetically.");
    }
}
