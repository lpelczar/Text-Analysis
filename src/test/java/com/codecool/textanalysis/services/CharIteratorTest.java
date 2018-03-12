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
    void whenHasNextCalledForFirst58TimesThenTrue() {
        boolean[] expected = new boolean[58];
        Arrays.fill(expected, true);
        boolean[] result = new boolean[58];
        for (int i = 0; i < 58; i++) {
            result[i] = charIterator.hasNext();
            charIterator.next();
        }
        assertArrayEquals(result, expected);
    }

    @Test
    void whenHasNextCalled59TimeThenFalse() {
        for (int i = 0; i < 58; i++) {
            charIterator.hasNext();
            charIterator.next();
        }
        assertFalse(charIterator.hasNext());
    }

    @Test
    void whenNextCalledThreeTimesThenReturnFirstThreeChars() {
        String[] expected = {"t", "h", "i"};
        String[] result = new String[3];
        for (int i = 0; i < 3; i++) {
            result[i] = charIterator.next();
        }
        assertArrayEquals(expected, result);
    }
}
