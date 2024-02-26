package com.tedeaston.practise.leetcode.easy;

public class validParentheses {
    public static boolean isValid(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' && s.charAt(i + 1) != ')'
                    || s.charAt(i) == ')' && s.charAt(-1) != '(') {
                return false;
            } else if (s.charAt(i) == '{' && s.charAt(i + 1) != '}'
                    || s.charAt(i) == '}' && s.charAt(-1) != '{') {
                return false;
            } else if (s.charAt(i) == '[' && s.charAt(i + 1) != ']'
                    || s.charAt(i) == ']' && s.charAt(-1) != '[') {
                return false;
            }
        }
        return true;
    }
}
