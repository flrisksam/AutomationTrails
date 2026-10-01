package lPrograms;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String input = "Sam paA";

        System.out.println("=== STRING ===");
        System.out.println("Input: " + input);
        System.out.println("Reverse: " + StringPrograms.reverse(input));
        System.out.println("Reverse words: " + StringPrograms.reverseWords(input));
        System.out.println("Character count: " + StringPrograms.getCharCount(input));
        System.out.println("Duplicate character count: "
                + StringPrograms.getDuplicateCharCount(input));
        System.out.println("Duplicate + unique: "
                + StringPrograms.getDuplicateAndUniqueChars(input));
        System.out.println("Without special characters: "
                + StringPrograms.removeSpecialChar("Sam@#$ 123"));
        System.out.println("Palindrome: "
                + StringPrograms.isPalindrome("Madam"));

        System.out.println("\n=== NUMBER ===");
        int[] swapped = NumberPrograms.swapNumbers(5, 8);
        System.out.println("Swap 5, 8: " + swapped[0] + ", " + swapped[1]);
        System.out.println("Is 3 prime? " + NumberPrograms.checkPrime(3));
        System.out.println("Is 2020 leap year? " + NumberPrograms.isLeapYear(2020));

        System.out.println("\n=== COLLECTION ===");
        System.out.println("Duplicate chars: "
                + CollectionPrograms.findDuplicateChars("programming"));
        System.out.println("Unique chars: "
                + CollectionPrograms.findUniqueChars("programming"));

        System.out.println("\n=== JAVA 8 STREAM ===");
        List<String> names = Arrays.asList("Sam", "Sampath", "Kumar", "Automation");
        System.out.println("Names > 4 chars: "
                + Java8StreamPrograms.findNameAboveFour(names));

        List<Integer> numbers = Arrays.asList(10, 15, 25, 30, 5);
        System.out.println("First > 20: "
                + Java8StreamPrograms.findFirstGreaterThanTwenty(numbers).orElse(null));
        System.out.println("Count > 20: "
                + Java8StreamPrograms.countGreaterThanTwenty(numbers));
    }
}
