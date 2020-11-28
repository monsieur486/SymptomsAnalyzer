package com.hemebiotech.analytics.core;

import com.hemebiotech.analytics.interfaces.ISymptomMap;
import com.hemebiotech.analytics.services.Log;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Class used to read the contents of the input file
 */
public class CountSymptomDataFromList implements ISymptomMap {

    private List<String> symptomList;

    /**
     * Counts symptoms from data list.
     *
     * @param rawResults the raw results
     */
    public CountSymptomDataFromList(List<String> rawResults) {
        this.symptomList = rawResults;
    }

    @Override
    public Map<String, Integer> getSymptoms() {

        Map<String, Integer> symptomsUnsorted = new HashMap<>();

        symptomList.forEach(symptom -> {

            if (!symptomsUnsorted.containsKey(symptom)) {
                symptomsUnsorted.put(symptom, 1);
            }

            else {
                Integer counter = symptomsUnsorted.get(symptom) + 1;
                symptomsUnsorted.put(symptom, counter);
            }

        });

        Log.info("symptoms counted and sorted successfully");
        return new TreeMap(symptomsUnsorted);
    }
}
