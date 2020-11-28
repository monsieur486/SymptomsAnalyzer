package com.hemebiotech.analytics.core;

import com.hemebiotech.analytics.config.ErrorCode;
import com.hemebiotech.analytics.interfaces.ISymptomReader;
import com.hemebiotech.analytics.services.ConsoleColors;
import com.hemebiotech.analytics.services.Log;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Class used to read the contents of the symptoms.txt file
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

    /**
     * The Path file.
     */
    public String pathFile;

    /**
     * Instantiates a new Read symptom data from file.
     *
     * @param pathFile the path file
     */
    public ReadSymptomDataFromFile(String pathFile) {this.pathFile = pathFile;}

    @Override
    public List<String> getSymptoms() {
        List<String> results = new ArrayList<>();

        /**
         *  Try to open the file in read mode
         */
        try {
            BufferedReader reader = new BufferedReader(new FileReader(pathFile));
            String line = reader.readLine();

            /**
             *  Treat symptoms as long as the file contains a non blank line
             */
            while (line != null) {
                results.add(line);
                line = reader.readLine();
            }

            reader.close();
        }
        /**
         *  Handling of read errors
         */ catch (IOException e) {
            Log.error(ConsoleColors.PURPLE + pathFile + ConsoleColors.RESET
                    + " read error"
            );
            System.exit(ErrorCode.READFILE);
        }

        Log.info("extraction of symptoms from "
                + ConsoleColors.PURPLE + pathFile + ConsoleColors.RESET
                + " successfully completed");

        return results;
    }
}
