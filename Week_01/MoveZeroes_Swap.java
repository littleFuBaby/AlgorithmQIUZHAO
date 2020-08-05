package com.ruoyi.grokking.algorithms.array;

public class MoveZeroes_Swap {

    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int num = nums[j];
                nums[j] = nums[i];
                nums[i] = num;
                j++;
            }
        }
    }

}
