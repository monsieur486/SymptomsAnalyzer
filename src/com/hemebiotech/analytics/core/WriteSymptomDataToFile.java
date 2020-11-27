package com.hemebiotech.analytics.core;

import com.hemebiotech.analytics.config.ErrorCode;
import com.hemebiotech.analytics.services.ConsoleColors;
import com.hemebiotech.analytics.services.Log;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Write class of the output file
 */
public class WriteSymptomDataToFile {

    /**
     * File write method
     *
     * @param symptomsSorted the symptoms sorted
     * @param outputFile     the output file
     */
    public static void writeFile(Map<String, Integer> symptomsSorted, String outputFile) {

        /**
         *  Try to open the result.out file in write mode
         */
        try {
            FileWriter writer = new FileWriter(outputFile);

            symptomsSorted.forEach((symptom, counter) -> {
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
                    System.exit(ErrorCode.WRITEFILE);
                }
            });

            /**
             *  close the file opened in write mode
             */
            writer.close();
        }
        /**
         *  Error management
         */ catch (IOException e) {
            Log.error("open "
                    + ConsoleColors.PURPLE + outputFile + ConsoleColors.RESET
                    + " in write mode");
            System.exit(ErrorCode.WRITEFILE);
        }

    }

}
