package org.example.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

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

    //417. Pacific Atlantic Water Flow
    @Test
    void pacificAtlantic() {
        assertEquals(
                List.of(List.of(0, 4), List.of(1, 3), List.of(1, 4), List.of(2, 2), List.of(3, 0), List.of(3, 1), List.of(4, 0)),
                solution.pacificAtlantic(new int[][]{{1,2,2,3,5}, {3,2,3,4,4}, {2,4,5,3,1}, {6,7,1,4,5}, {5,1,1,2,4}})
        );
        assertEquals(List.of(List.of(0, 0)), solution.pacificAtlantic(new int[][]{{1}}));
    }

    //778. Swim in Rising Water
    @Test
    void swimInWater() {
        assertEquals(3, solution.swimInWater(new int[][]{{0,2},{1,3}}));
        assertEquals(16, solution.swimInWater(new int[][]{{0,1,2,3,4},{24,23,22,21,5},{12,13,14,15,16},{11,17,18,19,20},{10,9,8,7,6}}));
    }

    //1488. Avoid Flood in The City
    @Test
    void avoidFlood() {
        assertEquals(-1, solution.avoidFlood(new int[]{1,2,3,4})[0]);
        assertEquals(-1, solution.avoidFlood(new int[]{1,2,3,4})[1]);
        assertEquals(-1, solution.avoidFlood(new int[]{1,2,3,4})[2]);
        assertEquals(-1, solution.avoidFlood(new int[]{1,2,3,4})[3]);

        assertEquals(-1, solution.avoidFlood(new int[]{1,2,0,0,2,1})[0]);
        assertEquals(-1, solution.avoidFlood(new int[]{1,2,0,0,2,1})[1]);
        assertEquals(2, solution.avoidFlood(new int[]{1,2,0,0,2,1})[2]);
        assertEquals(1, solution.avoidFlood(new int[]{1,2,0,0,2,1})[3]);
        assertEquals(-1, solution.avoidFlood(new int[]{1,2,0,0,2,1})[4]);
        assertEquals(-1, solution.avoidFlood(new int[]{1,2,0,0,2,1})[5]);

        assertEquals(0, solution.avoidFlood(new int[]{1,2,0,1,2}).length);

        assertEquals(0, solution.avoidFlood(new int[]{0,1,1}).length);
    }

    //2300. Successful Pairs of Spells and Potions
    @Test
    void successfulPairs() {
        assertEquals(4, solution.successfulPairs(new int[]{5,1,3}, new int[]{1,2,3,4,5}, 7)[0]);
        assertEquals(0, solution.successfulPairs(new int[]{5,1,3}, new int[]{1,2,3,4,5}, 7)[1]);
        assertEquals(3, solution.successfulPairs(new int[]{5,1,3}, new int[]{1,2,3,4,5}, 7)[2]);
        assertEquals(2, solution.successfulPairs(new int[]{3,1,2}, new int[]{8,5,8}, 16)[0]);
        assertEquals(0, solution.successfulPairs(new int[]{3,1,2}, new int[]{8,5,8}, 16)[1]);
        assertEquals(2, solution.successfulPairs(new int[]{3,1,2}, new int[]{8,5,8}, 16)[2]);

        assertEquals(17, solution.successfulPairs(
                new int[]{38,14,1,11,33,38,21,11,25,14,27,29,40,11,10,40,14,16,25,35,33,11,30,31,7,36,11,1,39,5,11,8,22,20,29,31,27,8,38,32,28,32,22,19,26,24,20,25,5,34,24,18},
                new int[]{33,14,15,32,26,37,35,32,30,28,24,29,13,22,39,9,26},
                39)
                [12]);
    }

    //3494. Find the Minimum Amount of Time to Brew Potions
    @Test
    void minTime() {
        assertEquals(110, solution.minTime(new int[]{1, 5, 2, 4}, new int[]{5, 1, 4, 2}));
        assertEquals(5, solution.minTime(new int[]{1, 1, 1}, new int[]{1, 1, 1}));
        assertEquals(21, solution.minTime(new int[]{1, 2, 3, 4}, new int[]{1, 2}));
    }
}