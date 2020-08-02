package com.ruoyi.grokking.algorithms.array;

public class SearchMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        // binary search
        int head = 0, tail = m * n - 1;

        while (head <= tail) {
            int center = (head + tail) / 2;
            int value = matrix[center / n][center % n];
            if (value > target) {
                tail = center - 1;
            } else if (value < target) {
                head = center + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
