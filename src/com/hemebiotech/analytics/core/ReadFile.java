package com.hemebiotech.analytics.core;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Class permettant de lire le contenu du fichier symptoms.txt
 */
public class ReadFile {

    /**
     * Méthode de lecture du fichier
     */
    public static void readFile() {

        /**
         *  Essai de lire le fichier
         */
        try {
            BufferedReader reader = new BufferedReader(new FileReader("symptoms.txt"));
            String line = reader.readLine();

            /**
             *  Traite les symptomes tant que le fichier contient une ligne non vide
             */
            while (line != null) {
                SymptomsTreatment.readSymptom(line);
                line = reader.readLine();
            }
            reader.close();
            System.out.println("[info] Symptoms import successfully completed.");
        }
        /**
         *  Gestion des erreurs de lecture
         */ catch (IOException e) {
            System.out.println("[error] File read error.");
            System.exit(1);
        }

    }
}
