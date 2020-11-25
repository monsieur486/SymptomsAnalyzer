package com.hemebiotech.analytics.core;

import com.hemebiotech.analytics.services.Log;
import com.hemebiotech.analytics.services.ReadFile;
import com.hemebiotech.analytics.services.WriteFile;
import com.hemebiotech.analytics.config.app;
import com.hemebiotech.analytics.config.errorCode;

import java.util.HashMap;
import java.util.Map;

/**
 * AnalyticsCounter class of the application
 * <p>
 * Extracts the symptoms from the symptoms.txt file and counts them
 * Alphabetically sorting the result obtained
 * Generate the result in the result.out file
 *
 * @author Laurent Touret monsieur486@gmail.com
 */
public class AnalyticsCounter {
    /**
     * Initiation of the public variable results
     */
    public static Map<String, Integer> results = new HashMap<>();

    /**
     * Initiation of the public variable symptomsSorted
     */
    public static Map<String, Integer> symptomsSorted;


    /**
     * The constant inputFile.
     */
    public static String inputFile = app.INPUTFILE;
    /**
     * The constant outputFile.
     */
    public static String outputFile = app.OUTPUTFILE;

    /**
     * Program initialization
     *
     * @param args name of the file to analyze
     * @throws Exception the exception
     */
    public static void main(String[] args) throws Exception {
        if (args.length == 1) {
            inputFile = args[0];
        }

        if (args.length == 2) {
            inputFile = args[0];
            outputFile = args[1];
        }

        if (args.length > 2) {
            Log.error("application executed with too many arguments");
            System.exit(errorCode.ARGUMENT);
        }

        /**
         *  Program initialization
         */
        Log.succes("program start");

        /**
         *  Extracts the symptoms from the symptoms.txt file and count them
         */
        ReadFile.readFile(inputFile);

        /**
         * Alphabetically sort the result obtained
         */
        OrderSymptoms.orderSymptoms();

        /**
         *  Generates the result in the result.out file
         */
        WriteFile.writeFile(outputFile);

        /**
         *  End of program
         */
        Log.succes("program stops");

    }
}
