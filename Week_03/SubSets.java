package com.ruoyi.grokking.algorithms.array;

import org.omg.CORBA.INTERNAL;

import java.util.LinkedList;
import java.util.List;

public class SubSets {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> output = new LinkedList<>();
        output.add(new LinkedList<>());

        if (nums == null || nums.length == 0)
            return output;

        for (int num : nums) {
            List<List<Integer>> subOutPut = new LinkedList<>();
            for (List<Integer> list : output) {
                subOutPut.add(new LinkedList<Integer>(list) {
                    {
                        add(num);
                    }
                });
            }
            for (List<Integer> list : subOutPut) {
                output.add(list);
            }
        }

        return output;
    }

}
