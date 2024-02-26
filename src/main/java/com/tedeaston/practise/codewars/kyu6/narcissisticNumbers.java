package com.tedeaston.practise.codewars.kyu6;

public class narcissisticNumbers {
    public static boolean isNarcissistic(int number) {
        int[] digits = Integer.toString(number).chars().map(c -> c-'0').toArray();
        int total = 0;
        for (int digit : digits) {
            total += Math.pow(digit, digits.length);
        }

        return number == total;
    }
}
