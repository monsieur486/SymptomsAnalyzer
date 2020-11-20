package com.hemebiotech.analytics.core;

import com.hemebiotech.analytics.Main;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Class d'écriture du fichier de sortie
 */
public class WriteFile {

    /**
     * Méthode d'écriture de fichier
     */
    public static void writeFile() {

        /**
         *  Essai d'ouvrir le fichier result.out en mode écriture
         */
        try {
            FileWriter writer = new FileWriter("result.out");

            Set set = Main.symptomsSorted.entrySet();
            Iterator iterator = set.iterator();

            /**
             *  Essai d'écrire les symptomes triés dans le fichier de sortie
             */
            try {
                /**
                 *  Parcours les symtomes trié alphabétiquement
                 */
                while (iterator.hasNext()) {
                    Map.Entry symptom = (Map.Entry) iterator.next();
                    String key = (String) symptom.getKey();
                    Integer value = (Integer) symptom.getValue();
                    writer.write(key + ": " + value + "\n");
                }
                writer.close();
                System.out.println("[succes] Result.out file created.");

            }
            /**
             *  Gestion des erreurs d'écriture
             */ catch (IOException e) {
                System.out.println("[error] File write error.");
                System.exit(2);
            }

        }
        /**
         *  Tri alphabériquement le résultat obtenu.
         */
        catch (IOException e) {
            System.out.println("[error] File write error.");
            System.exit(2);
        }

    }

}
