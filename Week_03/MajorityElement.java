package com.ruoyi.grokking.algorithms.array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer num = nums[i];
            Integer times = 1;
            if (map.containsKey(num)) {
                times = map.get(num) + 1;
            }
            if (times > nums.length / 2) {
                return num;
            }
            map.put(num, times);
        }
        return 0;
    }

}
