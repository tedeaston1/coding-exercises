package com.tedeaston.practise.codewars.kyu7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class highestAndLowest {
    public static String highAndLow(String nums) {
        String[] numArray = nums.split(" ");
        List<Integer> numList = new ArrayList<>();

        for (String num : numArray) {
            numList.add(Integer.parseInt(num));
        }

        Collections.sort(numList);

        System.out.println(numList);
        return numList.get(0) + " " + numList.get(numList.size()-1);
    }
}

