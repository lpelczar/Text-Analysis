package com.codecool.textanalysis.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class FileContentTest {

    private FileContent fileContent;

    @BeforeEach
    void before() {
        this.fileContent = new FileContent("testShort.txt");
    }

    @Test
    void whenInstantiatedThenFilepathIsSet() {
        assertThat(fileContent)
                .hasFieldOrProperty("filename");
        assertThat(fileContent.getFilename())
                .isEqualTo("testShort.txt");
    }

    @Test
    void whenCharIteratorCalledThenReturnCharIteratorClassObject() {
        assertThat(this.fileContent.charIterator())
                .isOfAnyClassIn(CharIterator.class);
    }

    @Test
    void whenWordIteratorCalledThenReturnWordIteratorClassObject() {
        assertThat(this.fileContent.wordIterator())
                .isOfAnyClassIn(WordIterator.class);
    }
}
