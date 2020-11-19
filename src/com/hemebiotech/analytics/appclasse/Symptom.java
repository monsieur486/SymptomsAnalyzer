package com.hemebiotech.analytics.appclasse;

public class Symptom {

    private String denomination;
    private Integer counter;

    public Symptom(String denomination, Integer counter){
        this.denomination = denomination;
        this.counter = counter;
    }

    public String getDenomination() {
        return denomination;
    }

    public Integer getCounter() {
        return counter;
    }

}
