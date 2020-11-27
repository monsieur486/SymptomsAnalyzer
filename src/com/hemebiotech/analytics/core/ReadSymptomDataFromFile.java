package com.hemebiotech.analytics.core;

import com.hemebiotech.analytics.config.errorCode;
import com.hemebiotech.analytics.interfaces.ISymptomReader;
import com.hemebiotech.analytics.services.ConsoleColors;
import com.hemebiotech.analytics.services.Log;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class used to read the contents of the symptoms.txt file
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

    public String pathFile;

    public ReadSymptomDataFromFile(String pathFile) {
        this.pathFile = pathFile;
    }

    /**
     * File read method
     *
     * @param inputFile the input file
     * @return the map
     */
    public static Map<String, Integer> ReadSymptoms(String inputFile) {

        Map<String, Integer> results = new HashMap<>();

        /**
         *  Try to open the file in read mode
         */
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line = reader.readLine();
            Log.succes("reading "
                    + ConsoleColors.PURPLE + inputFile + ConsoleColors.RESET
                    + " file for processing"
            );

            /**
             *  Treat symptoms as long as the file contains a nonblank line
             */

            Integer currentLine = 0;

            while (line != null) {
                currentLine += 1;
                SymptomsTreatment.readSymptom(line, currentLine, results);
                line = reader.readLine();
            }

            reader.close();
            Log.succes("symptoms import from "
                    + ConsoleColors.PURPLE + inputFile + ConsoleColors.RESET
                    + " successfully completed"
            );
        }
        /**
         *  Handling of read errors
         */ catch (IOException e) {
            Log.error(ConsoleColors.PURPLE + inputFile + ConsoleColors.RESET
                    + " read error"
            );
            System.exit(errorCode.READFILE);
        }

        return results;

    }

    @Override
    public List<String> getSymptoms() {
        List<String> results = new ArrayList<>();

        /**
         *  Try to open the file in read mode
         */
        try {
            BufferedReader reader = new BufferedReader(new FileReader(pathFile));
            String line = reader.readLine();
            Log.succes("reading "
                    + ConsoleColors.PURPLE + pathFile + ConsoleColors.RESET
                    + " file for processing"
            );

            /**
             *  Treat symptoms as long as the file contains a nonblank line
             */

            Integer currentLine = 0;

            while (line != null) {
                currentLine += 1;
                line = reader.readLine();
                results.add(line);
            }

            reader.close();
            Log.succes("symptoms import from "
                    + ConsoleColors.PURPLE + pathFile + ConsoleColors.RESET
                    + " successfully completed"
            );
        }
        /**
         *  Handling of read errors
         */ catch (IOException e) {
            Log.error(ConsoleColors.PURPLE + pathFile + ConsoleColors.RESET
                    + " read error"
            );
            System.exit(errorCode.READFILE);
        }

        return results;
    }
}
