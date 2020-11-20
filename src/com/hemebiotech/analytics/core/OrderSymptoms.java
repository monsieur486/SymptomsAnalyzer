package com.hemebiotech.analytics.core;

import com.hemebiotech.analytics.Main;
import java.util.TreeMap;

/**
 *  Classe permettant le tri alphabérique
 */
public class OrderSymptoms {

    /**
     *  Récupère le contenu de resultat et le tri dans symptomsSorted
     */
    public static void orderSymptoms(){

        Main.symptomsSorted = new TreeMap(Main.results);
        System.out.println("[info] Symptoms sorted alphabetically.");
    }
}
