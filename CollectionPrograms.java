package lPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionPrograms {

    // Find duplicate characters using a Set.
    // The returned set preserves the order in which duplicates are first detected.
    public static Set<Character> findDuplicateChars(String input) {
        Set<Character> seen = new LinkedHashSet<>();
        Set<Character> duplicates = new LinkedHashSet<>();

        if (input == null) {
            return duplicates;
        }

        for (char c : input.toCharArray()) {
            if (Character.isWhitespace(c)) {
                continue;
            }

            if (!seen.add(c)) {
                duplicates.add(c);
            }
        }

        return duplicates;
    }

    // Find unique characters using a Set-based approach.
    public static Set<Character> findUniqueChars(String input) {
        Set<Character> seen = new LinkedHashSet<>();
        Set<Character> duplicates = findDuplicateChars(input);

        if (input == null) {
            return seen;
        }

        for (char c : input.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                seen.add(c);
            }
        }

        seen.removeAll(duplicates);
        return seen;
    }
}
