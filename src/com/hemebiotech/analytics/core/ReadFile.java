package com.hemebiotech.analytics.core;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void readFile() throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("symptoms.txt"));
        String line = reader.readLine();

        while (line != null) {
            SymptomsTreatment.readSymptom(line);
            line = reader.readLine();
        }

        reader.close();

        System.out.println("[info] Symptoms import successfully completed.");

    }
}
