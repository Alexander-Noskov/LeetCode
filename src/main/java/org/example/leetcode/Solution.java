package org.example.leetcode;

public class Solution {
    private final static Solution instance;

    static {
        instance = new Solution();
    }

    public static Solution getInstance() {
        return instance;
    }

    //2221. Find Triangular Sum of an Array
    public int triangularSum(int[] nums) {
        return getSum(nums, nums.length);
    }

    private int getSum(int[] nums, int len){
        if (len == 1) return nums[0];
        for (int i = 0; i < len - 1; i++) {
            nums[i] = (nums[i] + nums[i + 1]) % 10;
        }
        return getSum(nums, len - 1);
    }

    //1518. Water Bottles
    public int numWaterBottles(int numBottles, int numExchange) {
        if (numExchange > numBottles) {
            return numBottles;
        }
        return numBottles + numFullBottles(numBottles, numExchange);
    }

    private int numFullBottles(int emptyBottles, int numExchange) {
        if (emptyBottles < numExchange) {
            return 0;
        }
        int numFullBottles = emptyBottles / numExchange;
        return numFullBottles + numFullBottles(emptyBottles % numExchange + numFullBottles, numExchange);
    }
}
