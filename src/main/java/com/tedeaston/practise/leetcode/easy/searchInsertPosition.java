package com.tedeaston.practise.leetcode.easy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class searchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        List<Integer> numList = new ArrayList<>();

        for (int num : nums) {
            numList.add(num);
        }

        for (int num : numList) {
            if(num == target) {
                return numList.indexOf(num);
            }
        }

        numList.add(target);
        Collections.sort(numList);

        return numList.indexOf(target);
    }
}
