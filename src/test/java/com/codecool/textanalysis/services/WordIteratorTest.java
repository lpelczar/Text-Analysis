package com.codecool.textanalysis.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordIteratorTest {

    private WordIterator wordIterator;

    @BeforeEach
    void before() {
        FileContent fileContent = new FileContent("testShort.txt");
        this.wordIterator = new WordIterator(fileContent);
    }

    @Test
    void whenInstantiatedThenAllWordsAreReadProperly() {
        assertEquals(12, wordIterator.getWordsQuantity());
    }
}
