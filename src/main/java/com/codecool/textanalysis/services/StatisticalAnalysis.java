package com.codecool.textanalysis.services;

import java.util.Arrays;
import java.util.Iterator;

public class StatisticalAnalysis {

    private Iterator<String> iterator;

    public StatisticalAnalysis(Iterator<String> iterator)  {
        this.iterator = iterator;
    }

    public int countOf(String... elements) {
        int occurrences = 0;
        while (iterator.hasNext()) {
            if (Arrays.asList(elements).contains(iterator.next())) {
                occurrences++;
            }
        }
        return occurrences;
    }
}
