package com.ruoyi.grokking.algorithms.array;

public class MoveZeroes_RemoveZero {

    public void moveZeroes(int[] nums) {
        int count = 0;
        int lastIndex = nums.length - 1;
        while (count < nums.length) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0 && i < lastIndex) {
                    System.arraycopy(nums, i + 1, nums, i, nums.length - 1 - i);
                    nums[lastIndex--] = 0;
                    break;
                }
            }
            count++;
        }
    }
}
