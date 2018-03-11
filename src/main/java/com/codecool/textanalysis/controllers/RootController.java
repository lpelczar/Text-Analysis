package com.codecool.textanalysis.controllers;

import com.codecool.textanalysis.services.FileContent;
import com.codecool.textanalysis.services.IterableText;
import com.codecool.textanalysis.views.RootView;
import com.codecool.textanalysis.services.StatisticalAnalysis;

public class RootController {

    private String[] consoleArgs;
    private RootView rootView;

    public RootController (String[] consoleArgs, RootView rootView) {
        this.consoleArgs = consoleArgs;
        this.rootView = rootView;
    }

    public void start() {
        if (this.consoleArgs.length == 0) {
            rootView.displayNoFileProvidedMessage();
            return;
        }

        for (String arg : this.consoleArgs) {
            IterableText iterableText = new FileContent(arg);
            handleAnalysisAndDisplayResults(arg, iterableText);
        }
    }

    private void handleAnalysisAndDisplayResults(String filename, IterableText iterableText) {
        showFileName(filename);
        showAllCharactersCountInFile(iterableText);
        showAllWordsCountInFile(iterableText);
        showMostUsedWords(iterableText);
        showLoveCount(iterableText);
        showHateCount(iterableText);
        showMusicCount(iterableText);
        showVowelsPercentage(iterableText);
    }

    private void showFileName(String filename) {
        rootView.displayFileName(filename);
    }

    private void showAllCharactersCountInFile(IterableText iterableText) {
        rootView.displayCharCount(new StatisticalAnalysis(iterableText.charIterator()).size());
    }

    private void showAllWordsCountInFile(IterableText iterableText) {
        rootView.displayWordCount(new StatisticalAnalysis(iterableText.wordIterator()).size());
    }

    private void showMostUsedWords(IterableText iterableText) {
        double onePercent = 0.01;
        Double onePercentOfAllWords = onePercent * new StatisticalAnalysis(iterableText.wordIterator()).size();
        rootView.displayMostUsedWords(new StatisticalAnalysis(iterableText.wordIterator())
                .occurMoreThan(onePercentOfAllWords.intValue()));
    }

    private void showLoveCount(IterableText iterableText) {
        rootView.displayLoveWordCount(new StatisticalAnalysis(iterableText.wordIterator()).countOf("love"));
    }

    private void showHateCount(IterableText iterableText) {
        rootView.displayHateWordCount(new StatisticalAnalysis(iterableText.wordIterator()).countOf("hate"));
    }

    private void showMusicCount(IterableText iterableText) {
        rootView.displayMusicWordCount(new StatisticalAnalysis(iterableText.wordIterator()).countOf("music"));
    }

    private void showVowelsPercentage(IterableText iterableText) {
        double vowelsCount = new StatisticalAnalysis(iterableText.charIterator())
                .countOf("a", "e", "i", "o", "u");
        double allCharacterQuantity = new StatisticalAnalysis(iterableText.charIterator()).size();
        rootView.displayVowelsPercentage((vowelsCount / allCharacterQuantity) * 100);
    }
}
