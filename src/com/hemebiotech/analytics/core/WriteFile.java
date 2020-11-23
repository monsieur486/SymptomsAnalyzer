package com.hemebiotech.analytics.core;

import com.hemebiotech.analytics.AnalyticsCounter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Write class of the output file
 */
public class WriteFile {

    /**
     * File write method
     */
    public static void writeFile() {

        /**
         *  Try to open the result.out file in write mode
         */
        try {
            FileWriter writer = new FileWriter("result.out");

            Set set = AnalyticsCounter.symptomsSorted.entrySet();
            Iterator iterator = set.iterator();

            /**
             * Trying to write the sorted symptoms to the output file
             */
            try {
                /**
                 *  Browse the symtoms sorted alphabetically
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
             *  Handling write errors
             */ catch (IOException e) {
                System.out.println("[error] File write error.");
                System.exit(2);
            }

        }
        /**
         *  Alphabetically sort the result obtained.
         */
        catch (IOException e) {
            System.out.println("[error] File write error.");
            System.exit(2);
        }

    }

}
