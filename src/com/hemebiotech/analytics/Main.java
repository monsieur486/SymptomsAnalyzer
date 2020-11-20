package com.hemebiotech.analytics;

import com.hemebiotech.analytics.core.OrderSymptoms;
import com.hemebiotech.analytics.core.ReadFile;
import com.hemebiotech.analytics.core.WriteFile;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static Map<String, Integer> results = new HashMap<>();
    public static Map<String, Integer> symptomsSorted;

    public static void main(String[] args) {

        System.out.println("====================");
        System.out.println("#  Program start   #");
        System.out.println("====================");

        ReadFile.readFile();
        OrderSymptoms.orderSymptoms();
        WriteFile.writeFile();

        System.out.println("====================");
        System.out.println("#  Program stops   #");
        System.out.println("====================");

    }
}
