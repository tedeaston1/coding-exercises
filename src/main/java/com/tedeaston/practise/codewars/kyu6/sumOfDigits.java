package com.tedeaston.practise.codewars.kyu6;

public class sumOfDigits {
    public static int DRoot(int n) {
        int[] digits = Integer.toString(n).chars().map(c -> c-'0').toArray();
        int sum = 0;
        while (digits.length > 1) {
            for (int digit : digits) {
                sum += digit;
            }
            digits = Integer.toString(sum).chars().map(c -> c-'0').toArray();
            sum = 0;
        }

        return digits[0];
    }
}
