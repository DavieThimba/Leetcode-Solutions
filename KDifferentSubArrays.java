package org.example;

import java.util.HashMap;
import java.util.Map;

public class KDifferentSubArrays {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums, k);
    }

    public int helper(int[] nums, int k) {
        int left = 0, safeIndex = 0, result = 0;

        Map<Integer, Integer> lastIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            lastIndexMap.put(nums[i], i);
            if(lastIndexMap.size() < k) continue;
            if(lastIndexMap.size() > k) {
                left = safeIndex + 1;
                lastIndexMap.remove(nums[safeIndex]);
                safeIndex++;
            }
            while(safeIndex != lastIndexMap.get(nums[safeIndex])) safeIndex++;

            result += (safeIndex - left + 1);
        }

        return result;
    }
}

/*
Given an integer array nums and an integer k, return the number of good subarrays of nums.

A good array is an array where the number of different integers in that array is exactly k.

For example, [1,2,3,1,2] has 3 different integers: 1, 2, and 3.
A subarray is a contiguous part of an array.
 */
