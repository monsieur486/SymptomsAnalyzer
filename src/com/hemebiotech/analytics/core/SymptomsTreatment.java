package com.hemebiotech.analytics.core;

import com.hemebiotech.analytics.Main;

/**
 * Class permettant le traitement des symptomes
 */
public class SymptomsTreatment {

    /**
     * Méthode des traitement des symtomes
     * @param line
     */
    public static void readSymptom(String line) {

        Integer counter;

        /**
         *  Test si le symptome existe. Dans ce cas récupère le compteur et l'incrémente de 1
         */
        if (Main.results.containsKey(line)) {
            counter = Main.results.get(line) + 1;
            Main.results.put(line, counter);
            System.out.println("[info] " + counter + "nd presence of the symptom " + line);
        }
        /**
         *  Si le symptome n'existe il est ajouté à la map avec un compteur à 1
         */
        else {
            Main.results.put(line, 1);
            System.out.println("[info] 1st presence of the symptom " + line);
        }
    }

}
