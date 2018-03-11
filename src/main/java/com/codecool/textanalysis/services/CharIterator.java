package com.codecool.textanalysis.services;

import java.util.Iterator;

public class CharIterator implements Iterator<String> {

    private FileContent fileContent;

    public CharIterator(FileContent fileContent) {
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
