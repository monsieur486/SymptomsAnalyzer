package com.hemebiotech.analytics.interfaces;

import java.util.Map;

/**
 * The interface Symptom reader.
 */
public interface ISymptomMap {
    /**
     * If no data available, returns an empty List
     *
     * @return Map symptoms count
     */
    Map<String, Integer> getSymptoms();
}
