package com.tedeaston.practise.codewars.kyu6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class countingDuplicates {
    public static int countDuplicates(String text) {
        Set<Character> charSet = new HashSet<>();
        List<Character> charList = new ArrayList<>();
        
        for (char letter : text.toCharArray()) {
            charSet.add(letter);
        }

        charList.addAll(charSet);
        System.out.println(charList);
        List<Integer> intList = new ArrayList<>();
        return 0;
    }
}
