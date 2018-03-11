package com.codecool.textanalysis.views;

import java.util.Set;

public class RootView {

    public void displayNoFileProvidedMessage() {
        System.out.println("You need to provide file in console argument e.g. 'java Application filename.txt'");
    }

    public void displayFileName(String filename) {
        System.out.println("==" + filename + "==");
    }

    public void displayCharCount(int size) {
        System.out.println("Char count: " + size);
    }

    public void displayWordCount(int size) {
        System.out.println("Word count: " + size);
    }

    public void displayMostUsedWords(Set<String> words) {
        System.out.println("Most used words (>1%): " + words);
    }

    public void displayLoveWordCount(int loveCount) {
        System.out.println("'love' count: " + loveCount);
    }

    public void displayHateWordCount(int hateCount) {
        System.out.println("'hate' count: " + hateCount);
    }

    public void displayMusicWordCount(int musicCount) {
        System.out.println("'music' count: " + musicCount);
    }

    public void displayVowelsPercentage(double percentage) {
        System.out.println(String.format("vowels %%: %.2f", percentage));
    }

    public void displayAToERatio(double ratio) {
        System.out.println(String.format("'a:e count ratio' : %.2f", ratio));
    }
}
