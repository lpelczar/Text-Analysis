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
        double onePercent = 0.01;
        rootView.displayFileName(filename);
        rootView.displayCharCount(new StatisticalAnalysis(iterableText.charIterator()).size());
        rootView.displayWordCount(new StatisticalAnalysis(iterableText.wordIterator()).size());
        Double onePercentOfAllWords = onePercent * new StatisticalAnalysis(iterableText.wordIterator()).size();
        rootView.displayMostUsedWords(new StatisticalAnalysis(iterableText.wordIterator())
                .occurMoreThan(onePercentOfAllWords.intValue()));
    }
}
