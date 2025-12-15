package leetcode.easy;

/*
LeetCode Problem: 1480. Running Sum of 1d Array
https://leetcode.com/problems/running-sum-of-1d-array/description/

Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.

Example 1:
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

Example 2:
Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

Example 3:
Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]
*/

import java.util.Arrays;

public class CummulativeSum {
    public int[] runningSum(int[] nums) {

        if (nums.length < 1 || nums.length > 1000){
            System.out.println("Array is out of range.");
            return nums;
        }

        for (int n : nums) {

            if (n < -1_000_000 || n > 1_000_000){
                System.out.println("Index value is out of range " + n);
                return nums;
            }

        }

        int[] commulativeSum = new int[nums.length];
        int runningTotal = 0;

        for (int i=0; i<nums.length; i++) {
            runningTotal += nums[i];
            commulativeSum[i] = runningTotal;
            System.out.println(runningTotal + " ");
        }

        System.out.println(Arrays.toString(commulativeSum));
        return commulativeSum;

    }
}
