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

    //407. Trapping Rain Water II
    @Test
    void trapRainWater() {
        assertEquals(4, solution.trapRainWater(new int[][]{{1,4,3,1,3,2}, {3,2,1,3,2,4}, {2,3,3,2,3,1}}));
        assertEquals(10, solution.trapRainWater(new int[][]{{3,3,3,3,3}, {3,2,2,2,3}, {3,2,1,2,3}, {3,2,2,2,3}, {3,3,3,3,3}}));
        assertEquals(14, solution.trapRainWater(new int[][]{{12,13,1,12}, {13,4,13,12}, {13,8,10,12}, {12,13,12,12}, {13,13,13,13}}));
    }

    //11. Container With Most Water
    @Test
    void maxArea() {
        assertEquals(49, solution.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        assertEquals(1, solution.maxArea(new int[]{1,1}));
    }
}