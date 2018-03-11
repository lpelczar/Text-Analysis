package com.codecool.textanalysis.controllers;

import com.codecool.textanalysis.views.RootView;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class RootControllerTest {

    @Test
    @DisplayName("FileNotExists")
    void whenWrongFileArgumentPassedThenThrowIllegalArgumentException() {
        String[] args = {"filename"};
        RootController rootController = new RootController(args, new RootView());
        assertThrows(IllegalArgumentException.class, rootController::start);
    }
}
