package com.hemebiotech.analytics.core;

import com.hemebiotech.analytics.services.ConsoleColors;
import com.hemebiotech.analytics.services.Log;

/**
 * Class for the treatment of symptoms
 */
public class SymptomsTreatment {

    /**
     * Method of treatment of symtoms
     *
     * @param line the symptom read on the line
     */
    public static void readSymptom(String line) {

        Integer counter;

        /**
         *  Test if the symptom exists. In this case get the counter and increment it by 1
         */
        if (AnalyticsCounter.results.containsKey(line)) {
            counter = AnalyticsCounter.results.get(line) + 1;
            AnalyticsCounter.results.put(line, counter);
            Log.info(ConsoleColors.PURPLE + counter
                    + "nd " + ConsoleColors.RESET
                    + "presence of the symptom "
                    + ConsoleColors.PURPLE + line + ConsoleColors.RESET
            );
        }
        /**
         *  If the symptom does not exist it is added to the map with a counter at 1
         */
        else {
            AnalyticsCounter.results.put(line, 1);
            Log.info(ConsoleColors.PURPLE + "1st " + ConsoleColors.RESET
                    + "presence of the symptom "
                    + ConsoleColors.PURPLE + line + ConsoleColors.RESET
            );
        }
    }

}
