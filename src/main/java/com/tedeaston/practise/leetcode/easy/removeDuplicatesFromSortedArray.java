package com.tedeaston.practise.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            numSet.add(num);
        }

        return numSet.size();
    }
}
