package com.example.internassignment.service;

import org.springframework.stereotype.Service;

@Service
public class PalindromeService {

    public boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }

        String normalized = input
                .replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();

        String reversed = new StringBuilder(normalized)
                .reverse()
                .toString();

        return normalized.equals(reversed);
    }
}
