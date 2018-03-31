# Text Analysis

Tests for text analysis console app written with JUnit and AssertJ

## Story

The goal is to implement a tool for lexical analysis of text data and write tests for them.

## Description

![c1](http://i66.tinypic.com/5ulm5c.png)

Classes to implement:

- IterableText interface. Create the interface with required methods.
- FileContent - class responsible for reading text files and providing its content through implementing IterableText interface. The content will be provided through methods charIterator() and wordIterator().
- CharIterator successively iterates over alphabetic characters (single letters) of the text. It skips all other characters (like white-spaces). Implements next() and hasNext() from Iterator interface. NOTE: Chars are represented as Strings for the sake of simplicity. Remember that characters’ case (UPPER or lower) should be consistent in our analysis.
- WordIterator    successively iterates over words of the text. Words in the text are separated with white-spaces. Implements next() and hasNext() from Iterator interface.
- StatisticalAnalysis is the dataset. It is initialized with Iterator and provides functions for statistical analysis of the text elements (Strings). NOTE: You may choose any data structure to store the processed data. The choice will affect the amount of code you will have to write.
- countOf(String… elems) function returns sum of all occurrences (in the dataset) of the elements given as arguments (elems). Note: One string may be given as well. The three-dots operator will help you pass variable number of arguments to the function and access them with ease.
- dictionarySize() function returns the number of unique elements of the dataset. It’s the size so-called Author’s Dictionary  the set of different words the author of the text uses.
- size() returns the total number of all elements in the dataset. This will be total number of words or total number of characters.
- occurMoreThan(Integer n) returns all the elements that occur more than n times in the dataset
- View this class should be responsible for presenting the data to the user. You are free to implement any functions you find sensible. NOTE: In case of this class you don’t have to follow the UML diagram.
- Application main class of the program. It should allow the user to pass to text files for analysis as CLI arguments. Also, measure the time of the program's execution. For example: 
-  java Application text1.txt text2.txt
- Handle only those exceptions which are required to be handled by the functions and methods you use. Custom error messages are not required (printStackTrace() can be used).
- The structure of packages tree is not restricted by anything but clean code principles.

## More info

Project made for [Codecool](https://codecool.com/) programming course.
