package com.hemebiotech.analytics.services;

import com.hemebiotech.analytics.config.errorCode;
import com.hemebiotech.analytics.core.SymptomsTreatment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Class used to read the contents of the symptoms.txt file
 */
public class ReadFile {

    /**
     * File read method
     *
     * @param inputFile the input file
     */
    public static void readFile(String inputFile) {

        /**
         *  Try to open the file in read mode
         */
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line = reader.readLine();
            Log.succes("reading " + inputFile + " file for processing");

            /**
             *  Treat symptoms as long as the file contains a nonblank line
             */
            while (line != null) {
                SymptomsTreatment.readSymptom(line);
                line = reader.readLine();
            }
            reader.close();
            Log.succes("symptoms import from " + inputFile + " successfully completed");
        }
        /**
         *  Handling of read errors
         */ catch (IOException e) {
            Log.error(inputFile + " read error");
            System.exit(errorCode.READFILE);
        }

    }
}
