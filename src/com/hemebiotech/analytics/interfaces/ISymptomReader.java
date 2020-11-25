package com.hemebiotech.analytics.interfaces;

import java.util.List;

/**
 * The interface Symptom reader.
 */
public interface ISymptomReader {
    /**
     * If no data is available, return an empty List
     *
     * @return a raw listing of all Symptoms obtained from a data source, duplicates are possible/probable
     */
    List<String> GetSymptoms();
}
