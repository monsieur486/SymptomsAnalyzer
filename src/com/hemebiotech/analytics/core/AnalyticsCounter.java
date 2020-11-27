package com.hemebiotech.analytics.core;

import com.hemebiotech.analytics.interfaces.ISymptomReader;
import com.hemebiotech.analytics.services.Log;
import com.hemebiotech.analytics.config.application;
import com.hemebiotech.analytics.config.errorCode;

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

    public static class MainTreatment implements ISymptomReader {

        public Map<String, Integer> results;
        public Map<String, Integer> symptomsSorted;

        private String inputFile;
        private String outputFile;

        public MainTreatment(String inputFile, String outputFile) {
            this.inputFile = inputFile;
            this.outputFile = outputFile;
        }

        @Override
        public Map<String, Integer> GetSymptoms() {
            Map<String, Integer> symptoms = ReadSymptomDataFromFile.ReadSymptoms(this.inputFile);
            return symptoms;
        }
    }

    /**
     * Program initialization
     *
     * @param args name of the file to analyze
     */
    public static void main(String[] args) {

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

        /**
         *  Program initialization
         */
        Log.info("program start");
        MainTreatment mainTreatment = new MainTreatment(inputFile, outputFile);

        /**
         *  Extracts the symptoms from the input file and count them
         */
        mainTreatment.results = ReadSymptomDataFromFile.ReadSymptoms(inputFile);

        /**
         * Alphabetically sort the result obtained
         */
        mainTreatment.symptomsSorted = OrderSymptoms.orderSymptoms(mainTreatment.results);

        /**
         *  Generates the result in the output file
         */
        WriteSymptomDataToFile.writeFile(mainTreatment.symptomsSorted, outputFile);

        /**
         *  End of program
         */
        Log.succes("program stops");

    }
}
