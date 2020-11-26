package com.hemebiotech.analytics.core;

import com.hemebiotech.analytics.services.Log;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Class allowing alphabetical sorting
 */
public class OrderSymptoms {

    /**
     * Get the content of result and sort in symptomsSorted
     * @return
     * @param results
     */
    public static Map<String, Integer> orderSymptoms(Map<String, Integer> results) {

        Map<String, Integer> SortedResults = new HashMap<>();

        SortedResults = new TreeMap(AnalyticsCounter.results);
        Log.succes("symptoms sorted alphabetically");

        return SortedResults;
    }
}
