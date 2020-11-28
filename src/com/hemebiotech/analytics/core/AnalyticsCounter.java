package com.hemebiotech.analytics.core;

import com.hemebiotech.analytics.config.Application;
import com.hemebiotech.analytics.interfaces.ISymptomMap;
import com.hemebiotech.analytics.interfaces.ISymptomReader;
import com.hemebiotech.analytics.services.Log;
import com.hemebiotech.analytics.config.ErrorCode;
import java.util.List;
import java.util.Map;

/**
 * AnalyticsCounter class of the Application
 * <p>
 * Extracts the symptoms from the input file and counts them
 * Sorts the result obtained alphabetically
 * Generates the result in the output file
 *
 * @author Laurent Touret monsieur486@gmail.com
 */
public class AnalyticsCounter {

    /**
     * Program initialization
     *
     * @param args names of input and output files
     */
    public static void main(String[] args) {

        /**
         *  Program initialization
         */
        String inputFile = Application.INPUTFILE;
        String outputFile = Application.OUTPUTFILE;

        if (args.length == 1) {
            inputFile = args[0];
        }

        if (args.length == 2) {
            inputFile = args[0];
            outputFile = args[1];
        }

        if (args.length > 2) {
            Log.error("Application executed with too many arguments");
            System.exit(ErrorCode.ARGUMENT);
        }

        /**
         *  Extracts the symptoms from the input file into rawResults list
         */
        ISymptomReader iSymptomReader = new ReadSymptomDataFromFile(inputFile);
        List<String> rawResults = iSymptomReader.getSymptoms();

        /**
         *  Counts the symptoms in the list and sorts them alphabetically
         */
        ISymptomMap iSymptomMap = new CountSymptomDataFromList(rawResults);
        Map<String, Integer> symptomsSorted = iSymptomMap.getSymptoms();

        /**
         *  Writes the result in the output file
         */
        WriteSymptomDataToFile.writeFile(symptomsSorted, outputFile);
    }
}
