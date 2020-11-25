package com.hemebiotech.analytics.core;

import com.hemebiotech.analytics.AnalyticsCounter;
import com.hemebiotech.analytics.services.Log;

import java.util.TreeMap;

/**
 *  Class allowing alphabetical sorting
 */
public class OrderSymptoms {

    /**
     *  Get the content of result and sort in symptomsSorted
     */
    public static void orderSymptoms(){

        AnalyticsCounter.symptomsSorted = new TreeMap(AnalyticsCounter.results);
        Log.s("symptoms sorted alphabetically");
    }
}
