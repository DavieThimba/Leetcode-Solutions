package org.example;

public class SmallestSubArrayGivenSum {
    public int findSmallestSubArray(int targetSum, int[] arr) {
        int minValue = Integer.MAX_VALUE;
        int startWindow = 0;
        int currentWindowSum = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            currentWindowSum += arr[windowEnd];

            while (currentWindowSum >= targetSum) {
                minValue = Math.min(minValue, windowEnd - startWindow + 1);
                currentWindowSum -= arr[startWindow];
                startWindow++;
            }
        }
        return minValue;
    }
}
