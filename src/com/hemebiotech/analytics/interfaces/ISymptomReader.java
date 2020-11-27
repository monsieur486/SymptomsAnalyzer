package com.hemebiotech.analytics.interfaces;

import java.util.Map;

/**
 * The interface Symptom reader.
 */
public interface ISymptomReader {
    /**
     * If no data is available, return an empty List
     *
     * @return Map map
     */
    Map<String, Integer> GetSymptoms();
}
