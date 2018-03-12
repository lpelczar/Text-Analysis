package com.codecool.textanalysis.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
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
        assertThat(charIterator.getCharsQuantity()).isEqualTo(58);
    }

    @Test
    void whenHasNextCalledForFirst58TimesThenTrue() {
        boolean[] result = new boolean[58];
        for (int i = 0; i < 58; i++) {
            result[i] = charIterator.hasNext();
            charIterator.next();
        }
        assertThat(result).doesNotContain(false);
    }

    @Test
    void whenHasNextCalled59TimeThenFalse() {
        for (int i = 0; i < 58; i++) {
            charIterator.hasNext();
            charIterator.next();
        }
        assertThat(charIterator.hasNext()).isFalse();
    }

    @Test
    void whenNextCalledThreeTimesThenReturnFirstThreeChars() {
        String[] result = new String[3];
        for (int i = 0; i < 3; i++) {
            result[i] = charIterator.next();
        }
        assertThat(result).containsExactly("t", "h", "i");
    }
}
