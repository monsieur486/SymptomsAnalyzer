package com.hemebiotech.analytics;

import com.hemebiotech.analytics.core.OrderSymptoms;
import com.hemebiotech.analytics.core.ReadFile;
import com.hemebiotech.analytics.core.WriteFile;
import java.util.HashMap;
import java.util.Map;

/**
 * AnalyticsCounter class of the application
 * <p>
 * Extracts the symptoms from the symptoms.txt file and counts them
 * Alphabetically sorting the result obtained
 * Generate the result in the result.out file
 * @author Laurent Touret
 */

public class AnalyticsCounter {
    /**
     *  Initiation of the public variable result Map<String, Integer>
     */
    public static Map<String, Integer> results = new HashMap<>();

    /**
     *  Initiation of the public variable symptomsSorted Map<String, Integer>
     */
    public static Map<String, Integer> symptomsSorted;

    /**
     *  Program initialization
     * @param args
     */
    public static void main(String[] args) {

        /**
         *  Program initialization
         */
        System.out.println("====================");
        System.out.println("#  Program start   #");
        System.out.println("====================");

        /**
         *  Extracts the symptoms from the symptoms.txt file and count them
         */
        ReadFile.readFile();

        /**
         * Alphabetically sort the result obtained
         */
        OrderSymptoms.orderSymptoms();

        /**
         *  Generates the result in the result.out file
         */
        WriteFile.writeFile();

        /**
         *  End of program
         */
        System.out.println("====================");
        System.out.println("#  Program stops   #");
        System.out.println("====================");

    }
}
