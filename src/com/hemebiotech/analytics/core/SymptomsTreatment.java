package com.hemebiotech.analytics.core;

import com.hemebiotech.analytics.AnalyticsCounter;
import com.hemebiotech.analytics.services.Log;

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
        if (AnalyticsCounter.results.containsKey(line)) {
            counter = AnalyticsCounter.results.get(line) + 1;
            AnalyticsCounter.results.put(line, counter);
            String msg = counter + "nd presence of the symptom " + line;
            Log.i(msg);
        }
        /**
         *  If the symptom does not exist it is added to the map with a counter at 1
         */
        else {
            AnalyticsCounter.results.put(line, 1);
            String msg = "1st presence of the symptom " + line;
            Log.i(msg);
        }
    }

}
