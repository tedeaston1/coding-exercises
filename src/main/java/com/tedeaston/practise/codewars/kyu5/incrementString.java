package com.tedeaston.practise.codewars.kyu5;

public class incrementString {
    public static String incrementString(String str) {
        String returnStr = "";
        if (str == "") {
            return "1";
        }
        char endChar = str.charAt(str.length());
        if (!Character.isDigit(endChar)) {
            returnStr = str.concat("1");
        } else {
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (i == chars.length - 1 && chars[i] == '0') {
                    returnStr = str.substring(0, i).concat("1");
                } else if (Character.isDigit(chars[i]) && chars[i] != '0') {
                    int endInt = Integer.parseInt(str.substring(i));
                    endInt++;
                    if (Integer.toString(endInt).length() > str.substring(i).length() && chars[i - 1] == '0') {
                        returnStr = str.substring(0, i - 1).concat(Integer.toString(endInt));
                        return returnStr;
                    }
                    returnStr = str.substring(0, i).concat(Integer.toString(endInt));
                    return returnStr;
                }
            }
        }
        return returnStr;
    }
}
