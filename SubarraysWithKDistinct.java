package org.example;

import java.util.HashMap;
import java.util.Map;

public class SubarraysWithKDistinct {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums, k);
    }

    public int helper(int[] nums, int k){
        int left = 0, safeIndex = 0;
        int result = 0;
        Map<Integer, Integer> lastIndexMap = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            lastIndexMap.put(nums[i], i);
            if(lastIndexMap.size() < k) continue;
            if(lastIndexMap.size() > k){
                left = safeIndex+1;
                lastIndexMap.remove(nums[safeIndex]);
                safeIndex++;
            }
            while(safeIndex != lastIndexMap.get(nums[safeIndex]))  safeIndex++;

            result += (safeIndex-left+1);
        }

        return result;
    }
}
