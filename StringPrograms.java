package lPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class StringPrograms {

    // 1. Reverse a string
    public static String reverse(String input) {
        if (input == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

    // 2. Reverse the order of words.
    // Example: "Java is easy" -> "easy is Java"
    public static String reverseWords(String input) {
        if (input == null || input.isBlank()) {
            return input;
        }

        String[] words = input.trim().split("\\s+");
        StringBuilder output = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            output.append(words[i]);
            if (i > 0) {
                output.append(" ");
            }
        }

        return output.toString();
    }

    // 3. Count every character, ignoring spaces.
    public static Map<Character, Integer> getCharCount(String input) {
        Map<Character, Integer> count = new LinkedHashMap<>();

        if (input == null) {
            return count;
        }

        for (char c : input.toCharArray()) {
            if (Character.isWhitespace(c)) {
                continue;
            }

            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        return count;
    }

    // 4. Return duplicate characters with their counts.
    public static Map<Character, Integer> getDuplicateCharCount(String input) {
        Map<Character, Integer> count = getCharCount(input);
        Map<Character, Integer> duplicates = new LinkedHashMap<>();

        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.put(entry.getKey(), entry.getValue());
            }
        }

        return duplicates;
    }

    // 5. Return duplicate and unique characters.
    public static Map<String, Set<Character>> getDuplicateAndUniqueChars(String input) {
        Map<Character, Integer> count = getCharCount(input);

        Set<Character> duplicates = new java.util.LinkedHashSet<>();
        Set<Character> unique = new java.util.LinkedHashSet<>();

        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            } else {
                unique.add(entry.getKey());
            }
        }

        Map<String, Set<Character>> result = new LinkedHashMap<>();
        result.put("duplicates", duplicates);
        result.put("unique", unique);
        return result;
    }

    // 6. Remove all characters except letters and digits.
    public static String removeSpecialChar(String input) {
        if (input == null) {
            return null;
        }

        StringBuilder output = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                output.append(c);
            }
        }

        return output.toString();
    }

    // 7. Check whether a string is a palindrome.
    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }

        String cleaned = removeSpecialChar(input).toLowerCase();
        return cleaned.equals(reverse(cleaned));
    }
}
