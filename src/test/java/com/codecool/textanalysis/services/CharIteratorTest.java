package com.codecool.textanalysis.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class CharIteratorTest {

    private CharIterator charIterator;

    @BeforeEach
    void before() {
        FileContent fileContent = new FileContent("testShort.txt");
        this.charIterator = new CharIterator(fileContent);
    }

    @Test
    void whenInstantiatedThenAllCharactersAreReadProperly() {
        assertEquals(58, charIterator.getCharsQuantity());
    }

    @Test
    void whenHasNextForFirst58TimesThenTrue() {
        boolean[] result = new boolean[58];
        for (int i = 0; i < 58; i++) {
            result[i] = charIterator.hasNext();
            charIterator.next();
        }
        boolean[] expected = new boolean[58];
        Arrays.fill(expected, true);
        assertArrayEquals(result, expected);
    }

    @Test
    void whenHasNext59TimeThenFalse() {
        for (int i = 0; i < 58; i++) {
            charIterator.hasNext();
            charIterator.next();
        }
        assertFalse(charIterator.hasNext());
    }
}
