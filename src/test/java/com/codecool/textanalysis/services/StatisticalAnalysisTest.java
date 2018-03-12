package com.codecool.textanalysis.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
}
