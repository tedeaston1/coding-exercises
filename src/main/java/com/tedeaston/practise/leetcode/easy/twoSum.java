package com.tedeaston.practise.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class twoSum {
    
    public static int[] twoSumMethod(int[] nums, int target) {
        for (int i = 0; i < nums.length; i ++) {
            for (int j = i + 1; j < nums.length; j ++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i , j};
                }
            }
        }
        
        return new int[] {0,0};
    }
}
