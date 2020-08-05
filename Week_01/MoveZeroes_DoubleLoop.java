package com.ruoyi.grokking.algorithms.array;

public class MoveZeroes_DoubleLoop {

    public void moveZeroes(int[] nums) {
        int[] newNums = new int[nums.length];
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                newNums[index++] = nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = newNums[i];
        }
    }

}
