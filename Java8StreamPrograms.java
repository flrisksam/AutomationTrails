package lPrograms;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Java8StreamPrograms {

    // Find names with length greater than four and convert them to upper case.
    public static List<String> findNameAboveFour(List<String> input) {
        return input.stream()
                .filter(name -> name != null && name.length() > 4)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    // Find the first number greater than twenty.
    public static Optional<Integer> findFirstGreaterThanTwenty(List<Integer> input) {
        return input.stream()
                .filter(number -> number != null && number > 20)
                .findFirst();
    }

    // Count numbers greater than twenty.
    public static long countGreaterThanTwenty(List<Integer> input) {
        return input.stream()
                .filter(number -> number != null && number > 20)
                .count();
    }
}
