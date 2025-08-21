package leetcode;

import java.io.IOException;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/1500-1599/1504.Count%20Submatrices%20With%20All%20Ones/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int[][] mat = {{1, 0, 1}, {1, 1, 0}, {1, 1, 0}};

        //--------------------------------------------------------------------------------------------------------------

        int m = mat.length, n = mat[0].length;
        int[][] g = new int[m][n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (mat[i][j] == 1) {
                    g[i][j] = j == 0 ? 1 : 1 + g[i][j - 1];
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                int col = 1 << 30;
                for (int k = i; k >= 0 && col > 0; --k) {
                    col = Math.min(col, g[k][j]);
                    ans += col;
                }
            }
        }
        //return ans;

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

