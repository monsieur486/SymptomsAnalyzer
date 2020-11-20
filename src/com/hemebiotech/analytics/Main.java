package com.hemebiotech.analytics;

import com.hemebiotech.analytics.core.DataRecovery;
import com.hemebiotech.analytics.core.WriteFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static Map<String, Integer> results = new HashMap<>();
    public static Map<String, Integer> symptomsSorted;

    public static void main(String[] args) throws IOException {

        System.out.println("[info] Program has started.");

        DataRecovery.dataRecovery();
        WriteFile.writeFile();

        System.out.println("====================");
        System.out.println("#  Program stops   #");
        System.out.println("====================");

    }
}
