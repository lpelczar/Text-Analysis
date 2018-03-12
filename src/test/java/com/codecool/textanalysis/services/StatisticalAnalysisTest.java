package com.codecool.textanalysis.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class StatisticalAnalysisTest {

    private StatisticalAnalysis statisticalAnalysis;

    @BeforeEach
    void before() {
        this.statisticalAnalysis = new StatisticalAnalysis(new FileContent("testShort.txt").charIterator());
    }

    @Test
    void whenCountOfCalledWithOneElementThenReturnCorrectOccurrences() {
        assertThat(statisticalAnalysis.countOf("e")).isEqualTo(9);
    }

    @Test
    void whenCountOfCalledWithMoreThanOneElementsThenReturnCorrectOccurrences() {
        assertThat(statisticalAnalysis.countOf("a", "e")).isEqualTo(10);
    }

    @Test
    void whenDictionarySizeThenReturnSizeOfUniqueElements() {
        assertThat(statisticalAnalysis.dictionarySize()).isEqualTo(18);
    }

    @Test
    void whenSizeThenReturnTotalNumberOfElements() {
        assertThat(statisticalAnalysis.size()).isEqualTo(58);
    }

    @Test
    void whenOccurMoreThan1CalledThenReturnCorrectElements() {
        Set<String> result = new HashSet<>(Arrays.asList("r", "s", "t", "e", "f", "g", "h", "i", "m", "n", "o"));
        assertThat(statisticalAnalysis.occurMoreThan(1)).isEqualTo(result);
    }
}