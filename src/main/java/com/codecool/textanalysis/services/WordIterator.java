package com.codecool.textanalysis.services;

import com.codecool.textanalysis.services.FileContent;

import java.util.Iterator;

public class WordIterator implements Iterator<String> {

    private FileContent fileContent;

    public WordIterator(FileContent fileContent) {
        this.fileContent = fileContent;
    }

    public boolean hasNext() {
        return false;
    }

    public String next() {
        return null;
    }

    public void remove() {}
}
