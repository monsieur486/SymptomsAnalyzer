package com.hemebiotech.analytics.core;

import com.hemebiotech.analytics.Main;
import java.util.TreeMap;

/**
 *  Class allowing alphabetical sorting
 */
public class OrderSymptoms {

    /**
     *  Get the content of result and sort in symptomsSorted
     */
    public static void orderSymptoms(){

        Main.symptomsSorted = new TreeMap(Main.results);
        System.out.println("[info] Symptoms sorted alphabetically.");
    }
}
