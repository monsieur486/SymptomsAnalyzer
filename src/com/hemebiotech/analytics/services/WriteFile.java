package com.hemebiotech.analytics.services;

import com.hemebiotech.analytics.AnalyticsCounter;
import java.io.FileWriter;
import java.io.IOException;

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

            AnalyticsCounter.symptomsSorted.forEach((symptom, counter) -> {
                /**
                 *  Try to write symptom's line in the file
                 */
                try {
                    writer.write(symptom + ": " + counter + "\n");
                }
                /**
                 *  Error management
                 */
                catch (IOException e) {
                    Log.e("file write error");
                    System.exit(3);
                }
            });

            /**
             *  Force close the file opened in write mode
             */
            writer.close();
            Log.s("result.out file created");
        }
        /**
         *  Error management
         */
        catch (IOException e) {
            Log.e("open file in write mode");
            System.exit(2);
        }

    }

}
