package com.hemebiotech.analytics.services;

import com.hemebiotech.analytics.config.errorCode;
import com.hemebiotech.analytics.core.AnalyticsCounter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Write class of the output file
 */
public class WriteFile {

    /**
     * File write method
     *
     * @param outputFile the output file
     */
    public static void writeFile(String outputFile) {

        /**
         *  Try to open the result.out file in write mode
         */
        try {
            FileWriter writer = new FileWriter(outputFile);

            AnalyticsCounter.symptomsSorted.forEach((symptom, counter) -> {
                /**
                 *  Try to write symptom line in the file
                 */
                try {
                    writer.write(symptom + ": " + counter + "\n");
                }
                /**
                 *  Error management
                 */ catch (IOException e) {
                    Log.error(ConsoleColors.PURPLE + outputFile + ConsoleColors.RESET
                            + " write error"
                    );
                    System.exit(errorCode.WRITEFILE);
                }
            });

            /**
             *  Force close the file opened in write mode
             */
            writer.close();
            Log.succes("output file "
                    + ConsoleColors.PURPLE + outputFile + ConsoleColors.RESET
                    + " created");
        }
        /**
         *  Error management
         */ catch (IOException e) {
            Log.error("open "
                    + ConsoleColors.PURPLE + outputFile + ConsoleColors.RESET
                    + " in write mode");
            System.exit(errorCode.WRITEFILE);
        }

    }

}
