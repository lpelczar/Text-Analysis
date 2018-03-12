package com.codecool.textanalysis.controllers;

import com.codecool.textanalysis.views.RootView;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RootControllerTest {

    private RootController rootController;
    private OutputStream outputStream;

    @BeforeEach
    void before() {
        this.outputStream = new ByteArrayOutputStream();
    }

    @Test
    @DisplayName("FileNotExists")
    void whenWrongFileArgumentPassedThenThrowIllegalArgumentException() {
        String[] args = {"filename"};
        this.rootController = new RootController(args, new RootView(new PrintStream(outputStream)));
        assertThrows(IllegalArgumentException.class, rootController::start);
    }

    @Test
    void whenTestShortFilePassedThenReturnCorrectResults() {
        String[] args = {"testShort.txt"};
        this.rootController = new RootController(args, new RootView(new PrintStream(outputStream)));
        rootController.start();
        System.out.println(outputStream.toString());
        assertThat(outputStream.toString())
                .contains(
                        "Char count: 58",
                        "Word count: 12",
                        "Dict size: 12",
                        "Most used words (>1%): [here, however, a, file",
                        "'love' count: 0",
                        "'hate' count: 0",
                        "'music' count: 0",
                        "vowels %: 37.93",
                        "'a:e count ratio' : 0.11",
                        "[a -> 1.72] [b -> 0.00] [c -> 0.00]",
                        "Benchmark time:");
    }
}
