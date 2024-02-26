package com.tedeaston.practise.codewars.kyu7;

public class exesAndOhs {
    public static boolean getXO(String str) {
        char[] charArray = str.toLowerCase().toCharArray();
        int countX = 0, countO = 0; 
        
        for (char letter : charArray) {
            if (letter == 'x') {
                countX ++;
            } else if (letter =='o') {
                countO ++;
            }
        }

        return countO == countX;
    }
}
