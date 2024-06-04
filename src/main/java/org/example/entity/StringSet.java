package org.example.entity;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StringSet {
    // Sabit metin içeriği
    private static final String DEFAULT_TEXT = "Your default text here...";

    public static Set<String> findUniqueWords() {
        // Sabit metni kullanarak kelimeleri bul
        return findUniqueWords(DEFAULT_TEXT);
    }

    public static Set<String> findUniqueWords(String text) {
        // Noktalama işaretlerini temizle
        String cleanedText = text.replaceAll("[.,!?\"']", "");
        // Kelimeleri ayır
        String[] words = cleanedText.split("\\s+");
        // Kelimeleri Set'e ekle ve alfabetik olarak sıralanmış şekilde döndür
        return Arrays.stream(words)
                .map(String::toLowerCase) // Kelimeleri küçük harfe çevir
                .collect(Collectors.toCollection(TreeSet::new));
    }
}
