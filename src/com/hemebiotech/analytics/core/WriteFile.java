package com.hemebiotech.analytics.core;

import com.hemebiotech.analytics.Main;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Tri alphabériquement le résultat obtenu.
 */
public class WriteFile {

    /**
     * Tri alphabériquement le résultat obtenu.
     */
    public static void writeFile() {

        /**
         *  Tri alphabériquement le résultat obtenu.
         */
        try {
            FileWriter writer = new FileWriter("result.out");

            Set set = Main.symptomsSorted.entrySet();
            Iterator iterator = set.iterator();

            /**
             *  Tri alphabériquement le résultat obtenu.
             */
            try {
                /**
                 *  Tri alphabériquement le résultat obtenu.
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
             *  Tri alphabériquement le résultat obtenu.
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
