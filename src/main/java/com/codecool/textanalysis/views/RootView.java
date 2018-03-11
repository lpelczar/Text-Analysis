package com.codecool.textanalysis.views;

public class RootView {

    public void displayNoFileProvidedMessage() {
        System.out.println("You need to provide file in console argument like 'java com.codecool.textanalysis.main.Application filename.txt'");
    }

    public void displayFileName(String filename) {
        System.out.println("==" + filename + "==");
    }

    public void displayCharCount(int size) {
        System.out.println("Char count: " + size);
    }

    public void displayWordCount(int size) {
        System.out.println("Word count:" + size);
    }
}
