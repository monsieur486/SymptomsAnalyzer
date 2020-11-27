package com.hemebiotech.analytics.core;

import com.hemebiotech.analytics.interfaces.ISymptomReader;
import com.hemebiotech.analytics.services.Log;
import com.hemebiotech.analytics.config.application;
import com.hemebiotech.analytics.config.errorCode;

import java.util.List;
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
     * Program initialization
     *
     * @param args name of the file to analyze
     */
    public static void main(String[] args) {

        List<String> brutResults;
        Map<String, Integer> results;
        Map<String, Integer> symptomsSorted;

        /**
         * The constant inputFile.
         */
        String inputFile = application.INPUTFILE;
        /**
         * The constant outputFile.
         */
        String outputFile = application.OUTPUTFILE;

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

        ISymptomReader iSymptomReader = new ReadSymptomDataFromFile(inputFile);

        /**
         *  Extracts the symptoms from the input file and count them
         */
        brutResults = iSymptomReader.getSymptoms();


        /**
         * Alphabetically sort the result obtained
         */
        //symptomsSorted = OrderSymptoms.orderSymptoms(results);

        /**
         *  Generates the result in the output file
         */
        //WriteSymptomDataToFile.writeFile(symptomsSorted, outputFile);

        /**
         *  Program initialization
         */
        Log.info("program start");

        /**
         *  End of program
         */
        Log.succes("program stops");

    }
}
