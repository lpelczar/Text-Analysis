package com.codecool.textanalysis.controllers;

import com.codecool.textanalysis.services.FileContent;
import com.codecool.textanalysis.services.IterableText;
import com.codecool.textanalysis.views.RootView;
import com.codecool.textanalysis.services.StatisticalAnalysis;
import com.sun.xml.internal.bind.v2.TODO;

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
            handleAnalysisAndDisplayResults(arg, new StatisticalAnalysis(iterableText.charIterator()),
                    new StatisticalAnalysis(iterableText.wordIterator()));
        }
    }

    private void handleAnalysisAndDisplayResults(String filename, StatisticalAnalysis charAnalysis,
                                                 StatisticalAnalysis wordAnalysis) {
        rootView.displayFileName(filename);
        rootView.displayCharCount(charAnalysis.size());
        rootView.displayWordCount(wordAnalysis.size());
        Double onePercentOfAllWords = 0.01 * wordAnalysis.size();
        rootView.displayMostUsedWords(wordAnalysis.occurMoreThan(onePercentOfAllWords.intValue()));
    }
}
