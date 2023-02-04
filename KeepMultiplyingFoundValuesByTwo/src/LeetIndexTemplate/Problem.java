package LeetIndexTemplate;

import java.util.HashSet;

public class Problem {

    // url of problem
    // https://leetcode.com/problems/keep-multiplying-found-values-by-two/

    // SUBMITTED 2023.02.04

    public static int findFinalValue(int[] nums, int original) {

        // Set for collecting values since duplicates do not matter
        // Set.contains() method has O(1) run time, so checking against set contents is fast
        HashSet<Integer> hashSet = new HashSet<>();

        // add all values of array to set
        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }

        // continue multiplying original by 2 as long as set contains original
        while (hashSet.contains(original)) {
            original *= 2;
        }

        // while loop exits when multiplied original cannot be found, return it!
        return original;
    }
}
