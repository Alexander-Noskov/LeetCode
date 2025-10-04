package org.example.leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

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

    //3100. Water Bottles II
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int sumFullBottles = numBottles;
        int emptyBottles = numBottles;
        while (emptyBottles >= numExchange) {
            emptyBottles = emptyBottles - numExchange + 1;
            sumFullBottles++;
            numExchange++;
        }
        return sumFullBottles;
    }

    //407. Trapping Rain Water II
    public int trapRainWater(int[][] heightMap) {

        int m = heightMap.length;
        int n = heightMap[0].length;
        boolean[][] visited = new boolean[m][n];
        Queue<Cell> pq = new PriorityQueue<>();

        // Заполнение первой и последней строки
        for (int i = 0; i < m; i++) {
            pq.offer(new Cell(i, 0, heightMap[i][0]));
            pq.offer(new Cell(i, n - 1, heightMap[i][n - 1]));
            visited[i][0] = true;
            visited[i][n - 1] = true;
        }

        // Заполнение первого и последнего столбца
        for (int j = 1; j < n - 1; j++) {
            pq.offer(new Cell(0, j, heightMap[0][j]));
            pq.offer(new Cell(m - 1, j, heightMap[m - 1][j]));
            visited[0][j] = true;
            visited[m - 1][j] = true;
        }

        //Верх, низ, лево, право
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int maxHeight = 0;
        int water = 0;

        while (!pq.isEmpty()) {
            Cell current = pq.poll();
            maxHeight = Math.max(maxHeight, current.height);

            // Проверка всех соседних ячеек
            for (int[] dir : directions) {
                int newRow = current.row + dir[0];
                int newCol = current.col + dir[1];

                // Проверка выхода за границы и посещённой ячейки
                if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && !visited[newRow][newCol]) {
                    visited[newRow][newCol] = true;

                    // Если текущая высота меньше максимального барьера, добавить разницу высот как воду
                    if (heightMap[newRow][newCol] < maxHeight) {
                        water += maxHeight - heightMap[newRow][newCol];
                    }

                    // Добавить новую ячейку в очередь
                    pq.offer(new Cell(newRow, newCol, heightMap[newRow][newCol]));
                }
            }
        }
        return water;
    }

    class Cell implements Comparable<Cell> {
        int row, col, height;

        Cell(int row, int col, int height) {
            this.row = row;
            this.col = col;
            this.height = height;
        }

        @Override
        public int compareTo(Cell other) {
            return Integer.compare(this.height, other.height);
        }
    }

    //11. Container With Most Water
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                maxArea = Math.max(maxArea, height[left] * (right - left));
                ++left;
            } else {
                maxArea = Math.max(maxArea, height[right] * (right - left));
                --right;
            }
        }

        return maxArea;
    }
}
