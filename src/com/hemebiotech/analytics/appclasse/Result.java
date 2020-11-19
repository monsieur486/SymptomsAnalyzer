package com.hemebiotech.analytics.appclasse;

import java.util.*;

public class Result {

/*    Map<String, Integer> result = Result.getResults();
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
        String key = entry.getKey();
        Integer value = entry.getValue();
        System.out.println(key + ": " + value);
    }*/

    public static Map<String, Integer> getResults() {
        Map<String,  Integer> results = new HashMap<>();

        Symptom symptom01 = new Symptom("toto", 2);
        Symptom symptom02 = new Symptom("tata", 5);
        Symptom symptom03 = new Symptom("un petit", 3);

        results.put(symptom01.getDenomination(), symptom01.getCounter());
        results.put(symptom02.getDenomination(), symptom02.getCounter());
        results.put(symptom03.getDenomination(), symptom03.getCounter());

        List<String> symptomOrder = new ArrayList<>(results.keySet());
        Collections.sort(symptomOrder);

        System.out.println(symptomOrder);

        return results;

    }
}
