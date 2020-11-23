package com.hemebiotech.analytics.core;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Class used to read the contents of the symptoms.txt file
 */
public class ReadFile {

    /**
     * File read method
     */
    public static void readFile() {

        /**
         *  Try to open the file in read mode
         */
        try {
            BufferedReader reader = new BufferedReader(new FileReader("symptoms.txt"));
            String line = reader.readLine();

            /**
             *  Treat symptoms as long as the file contains a nonblank line
             */
            while (line != null) {
                SymptomsTreatment.readSymptom(line);
                line = reader.readLine();
            }
            reader.close();
            System.out.println("[info] Symptoms import successfully completed.");
        }
        /**
         *  Handling of read errors
         */ catch (IOException e) {
            System.out.println("[error] File read error.");
            System.exit(1);
        }

    }
}
