package com.hemebiotech.analytics.interfaces;

import java.util.List;

/**
 * The interface Symptom reader.
 */
public interface ISymptomReader {
    /**
     * If no data available, returns an empty List
     *
     * @return List rawResult
     */
    List<String> getSymptoms();
}
