package medium;

import java.util.ArrayList;
import java.util.List;

public class MaxIncreaseToKeepCitySkyline {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        List<Integer> vertical = new ArrayList<>();
        List<Integer> horizontal = new ArrayList<>();
        int count = 0;
        int max_j = 0;

        for (int i = 0 ; i < grid.length; i++) {
            vertical.add(grid[i][0]);
            for (int j = 0; j < grid[i].length; j++){
                if (i == 0 || max_j < j) {
                    horizontal.add(grid[i][j]);
                    max_j++;
                } else {
                    int max = horizontal.get(j) > grid[i][j] ? horizontal.get(j) : grid[i][j];
                    horizontal.set(j, max);
                }
                int max_v = vertical.get(i) > grid[i][j] ? vertical.get(i) : grid[i][j];
                vertical.set(i, max_v);
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                count += Math.min(vertical.get(i), horizontal.get(j)) - grid[i][j];
            }
        }

        return count;
    }


    public static void main(String[] args) {
        MaxIncreaseToKeepCitySkyline obj = new MaxIncreaseToKeepCitySkyline();
        System.out.println(obj.maxIncreaseKeepingSkyline(new int[][] {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}}));
    }
}
