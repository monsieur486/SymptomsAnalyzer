package com.hemebiotech.analytics.core;

import com.hemebiotech.analytics.Main;

public class SymptomsTreatment {

    public static void readSymptom(String line){

        Integer counter;

        if (Main.results.containsKey(line)) {
            counter = Main.results.get(line) + 1;
            Main.results.put(line, counter);
            System.out.println("[info] "+ counter +"nd presence of the symptom " + line);
        } else {
            Main.results.put(line, 1);
            System.out.println("[info] 1st presence of the symptom " + line);
        }
    }

}
