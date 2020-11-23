package com.hemebiotech.analytics.core;

import com.hemebiotech.analytics.Main;

/**
 * Class for the treatment of symptoms
 */
public class SymptomsTreatment {

    /**
     * Method of treatment of symtoms
     * @param line
     */
    public static void readSymptom(String line) {

        Integer counter;

        /**
         *  Test if the symptom exists. In this case get the counter and increment it by 1
         */
        if (Main.results.containsKey(line)) {
            counter = Main.results.get(line) + 1;
            Main.results.put(line, counter);
            System.out.println("[info] " + counter + "nd presence of the symptom " + line);
        }
        /**
         *  If the symptom does not exist it is added to the map with a counter at 1
         */
        else {
            Main.results.put(line, 1);
            System.out.println("[info] 1st presence of the symptom " + line);
        }
    }

}
