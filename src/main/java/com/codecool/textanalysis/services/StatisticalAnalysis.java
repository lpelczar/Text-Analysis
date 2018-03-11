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
        Set<String> set = new HashSet<>();
        Set<String> duplicateSet = new HashSet<>();

        while (iterator.hasNext()) {
            if (!set.add(iterator.next())) {
                duplicateSet.add(iterator.next());
            }
        }
        set.removeAll(duplicateSet);
        return set.size();
    }

    public int size() {
        Set<String> elements = new HashSet<>();
        while (iterator.hasNext()) {
            elements.add(iterator.next());
        }
        return elements.size();
    }
}
