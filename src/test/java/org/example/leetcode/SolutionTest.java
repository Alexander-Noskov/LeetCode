package org.example.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private static Solution solution;

    @BeforeAll
    static void setUp() {
        solution = Solution.getInstance();
    }

    //2221. Find Triangular Sum of an Array
    @Test
    void triangularSum() {
        assertEquals(8, solution.triangularSum(new int[]{1, 2, 3, 4, 5}));
        assertEquals(5, solution.triangularSum(new int[]{5}));
    }

    //1518. Water Bottles
    @Test
    void numWaterBottles() {
        assertEquals(13, solution.numWaterBottles(9, 3));
        assertEquals(19, solution.numWaterBottles(15, 4));
    }

    //3100. Water Bottles II
    @Test
    void maxBottlesDrunk() {
        assertEquals(15, solution.maxBottlesDrunk(13, 6));
        assertEquals(13, solution.maxBottlesDrunk(10, 3));
    }
}