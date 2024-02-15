package org.example;

public class MaxSumSubArray {
    public static int maxSumSubArray(int[] arr, int k) {
        int maxValue = Integer.MIN_VALUE;
        int currentRunningSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentRunningSum += arr[i];
            if (i >= k - 1) {
                maxValue = Math.max(maxValue, currentRunningSum);
                currentRunningSum = arr[i - (k - 1)];
            }
        }
        return maxValue;
    }

    // Sliding Window
    public static void main(String[] args) {
        System.out.println(maxSumSubArray(new int[] {4,2,1,7,8,1,2,8,1,0}, 3));
    }

}
