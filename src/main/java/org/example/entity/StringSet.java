package org.example.entity;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StringSet {

    private static final String DEFAULT_TEXT = "Your default text here...";

    public static Set<String> findUniqueWords() {

        return findUniqueWords(DEFAULT_TEXT);
    }

    public static Set<String> findUniqueWords(String text) {

        String cleanedText = text.replaceAll("[.,!?\"']", "");

        String[] words = cleanedText.split("\\s+");

        return Arrays.stream(words)
                .map(String::toLowerCase)
                .collect(Collectors.toCollection(TreeSet::new));
    }
}
