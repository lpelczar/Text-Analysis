package com.codecool.textanalysis.services;

import java.util.*;

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

    public int dictionarySize() {
        Set<String> elements = new HashSet<>();
        while (iterator.hasNext()) {
            elements.add(iterator.next());
        }
        return elements.size();
    }

    public int size() {
        int totalNumber = 0;
        while (iterator.hasNext()) {
            totalNumber++;
        }
        return totalNumber;
    }
}
