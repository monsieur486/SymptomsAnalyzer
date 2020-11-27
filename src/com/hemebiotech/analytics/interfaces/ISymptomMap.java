package com.hemebiotech.analytics.interfaces;

import java.util.List;
import java.util.Map;

/**
 * The interface Symptom reader.
 */
public interface ISymptomMap {
    /**
     * If no data is available, return an empty List
     *
     * @return Map map
     */
    Map<String, Integer> getSymptoms();
}
