package org.example;

class MatricesProblem {
    public int matricesProblem(int[][] A) {
        int N = A.length; // Number of rows
        int M = A[0].length; // Number of columns

        int[] maxRowValues = new int[N];
        int[] maxColValues = new int[M];

        // Step 1: Find maximum values for rows and columns
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                maxRowValues[i] = Math.max(maxRowValues[i], A[i][j]);
                maxColValues[j] = Math.max(maxColValues[j], A[i][j]);
            }
        }

        // Step 2: Find maximum sum of non-attacking rooks
        int maxSum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int sum = maxRowValues[i] + maxColValues[j];
                maxSum = Math.max(maxSum, sum);
            }
        }

        // Step 3: Return the maximum sum
        return maxSum;
    }
}