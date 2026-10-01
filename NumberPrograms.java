package lPrograms;

public class NumberPrograms {

    // 1. Swap two numbers without a third variable.
    // Arithmetic approach; assumes integer overflow is not an issue.
    public static int[] swapNumbers(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        return new int[]{a, b};
    }

    // 2. Check whether a number is prime.
    public static boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= n / i; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // 3. Check whether a year is a leap year.
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 ||
               (year % 4 == 0 && year % 100 != 0);
    }
}
