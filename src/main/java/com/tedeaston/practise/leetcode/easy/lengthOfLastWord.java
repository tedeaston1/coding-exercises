package com.tedeaston.practise.leetcode.easy;

public class lengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] wordArr = s.split(" ");
        return wordArr[wordArr.length - 1].length();        
    }
}
