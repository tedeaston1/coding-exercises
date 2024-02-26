package com.tedeaston.practise.codewars.kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class yourOrderPlease {
    public static String order(String words) {
        if (words == "") {
            return "";
        }
        
        List<String> wordList = new ArrayList<>(Arrays.asList(words.split(" ")));
        Map<Integer, String> wordMap = new TreeMap<>();

        for (String word : wordList) {
            int orderIndex = Integer.parseInt(word.replaceAll("[^0-9]", ""));
            wordMap.put(orderIndex, word);
        }
        
        String returnStr = "";
        
        for (Map.Entry<Integer, String> entry : wordMap.entrySet()) {
            returnStr = returnStr + entry.getValue() + " ";
        }

        return returnStr.substring(0, returnStr.length() - 1);
    }
}
