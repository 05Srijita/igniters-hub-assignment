package com.example.internassignment.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class StringManipulationService {

    public StringResult manipulate(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return new StringResult(0, "", "");
        }

        String cleanedSentence = sentence.trim();
        String[] words = cleanedSentence.split("\\s+");

        List<String> reversedWords = Arrays.asList(words);
        Collections.reverse(reversedWords);

        String reversedSentence = String.join(" ", reversedWords);
        String modifiedSentence = cleanedSentence.replaceAll("\\s+", "-");

        return new StringResult(
                words.length,
                reversedSentence,
                modifiedSentence
        );
    }

    public record StringResult(
            int wordCount,
            String reversedSentence,
            String modifiedSentence
    ) {
    }
}
