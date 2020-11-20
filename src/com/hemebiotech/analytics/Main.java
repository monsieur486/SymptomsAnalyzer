package com.hemebiotech.analytics;

import com.hemebiotech.analytics.core.OrderSymptoms;
import com.hemebiotech.analytics.core.ReadFile;
import com.hemebiotech.analytics.core.WriteFile;

import java.util.HashMap;
import java.util.Map;

/**
 * Classe principale de l'application
 * <p>
 * Extrait les symptomes du fichier symptoms.txt et les compte.
 * Tri alphabériquement le résultat obtenu.
 * Génère le résultat dans le fichier result.out.
 * @author Laurent Touret
 */

public class Main {
    /**
     *  Initialise la variable public resultats Map<String, Integer>
     */
    public static Map<String, Integer> results = new HashMap<>();

    /**
     *  Initialise la variable public symptomsSorted Map<String, Integer>
     */
    public static Map<String, Integer> symptomsSorted;

    /**
     *  Initialise le programme
     * @param args
     */
    public static void main(String[] args) {

        /**
         *  Initialise le programme
         */
        System.out.println("====================");
        System.out.println("#  Program start   #");
        System.out.println("====================");

        /**
         *  Extrait les symptomes du fichier symptoms.txt et les compte.
         */
        ReadFile.readFile();

        /**
         *  Tri alphabériquement le résultat obtenu.
         */
        OrderSymptoms.orderSymptoms();

        /**
         *  Génère le résultat dans le fichier result.out.
         */
        WriteFile.writeFile();

        /**
         *  Fin du programme
         */
        System.out.println("====================");
        System.out.println("#  Program stops   #");
        System.out.println("====================");

    }
}
