package com.hemebiotech.analytics.core;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Tri alphabériquement le résultat obtenu.
 */
public class ReadFile {

    /**
     * Tri alphabériquement le résultat obtenu.
     */
    public static void readFile() {

        /**
         *  Tri alphabériquement le résultat obtenu.
         */
        try {
            BufferedReader reader = new BufferedReader(new FileReader("symptoms.txt"));
            String line = reader.readLine();

            /**
             *  Tri alphabériquement le résultat obtenu.
             */
            while (line != null) {
                SymptomsTreatment.readSymptom(line);
                line = reader.readLine();
            }
            reader.close();
            System.out.println("[info] Symptoms import successfully completed.");
        }
        /**
         *  Tri alphabériquement le résultat obtenu.
         */ catch (IOException e) {
            System.out.println("[error] File read error.");
            System.exit(1);
        }

    }
}
