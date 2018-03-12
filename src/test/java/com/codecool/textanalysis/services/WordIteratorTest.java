package com.codecool.textanalysis.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class WordIteratorTest {

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

    @Test
    void whenHasNextCalledForFirst12TimesThenTrue() {
        boolean[] expected = new boolean[12];
        Arrays.fill(expected, true);
        boolean[] result = new boolean[12];
        for (int i = 0; i < 12; i++) {
            result[i] = wordIterator.hasNext();
            wordIterator.next();
        }
        assertArrayEquals(result, expected);
    }

    @Test
    void whenHasNextCalled13TimeThenFalse() {
        for (int i = 0; i < 13; i++) {
            wordIterator.hasNext();
            wordIterator.next();
        }
        assertFalse(wordIterator.hasNext());
    }

    @Test
    void whenNextCalledThreeTimesThenReturnFirstThreeChars() {
        String[] expected = {"this", "is", "a"};
        String[] result = new String[3];
        for (int i = 0; i < 3; i++) {
            result[i] = wordIterator.next();
        }
        assertArrayEquals(expected, result);
    }
}
