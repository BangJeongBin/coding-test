package leetcode;

import java.io.IOException;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/3100-3199/3195.Find%20the%20Minimum%20Area%20to%20Cover%20All%20Ones%20I/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int[][] grid = {{0, 1, 0}, {1, 0, 1}};

        //--------------------------------------------------------------------------------------------------------------

        int m = grid.length, n = grid[0].length;
        int x1 = m, y1 = n;
        int x2 = 0, y2 = 0;
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (grid[i][j] == 1) {
                    x1 = Math.min(x1, i);
                    y1 = Math.min(y1, j);
                    x2 = Math.max(x2, i);
                    y2 = Math.max(y2, j);
                }
            }
        }
        //return (x2 - x1 + 1) * (y2 - y1 + 1);

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

