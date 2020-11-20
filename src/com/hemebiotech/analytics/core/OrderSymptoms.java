package com.hemebiotech.analytics.core;

import com.hemebiotech.analytics.Main;
import java.util.TreeMap;

public class OrderSymptoms {

    public static void orderSymptoms(){

        Main.symptomsSorted = new TreeMap(Main.results);
        System.out.println("[info] Symptoms sorted alphabetically.");
    }
}
