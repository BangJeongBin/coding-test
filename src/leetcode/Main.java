package leetcode;

import java.io.IOException;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/2700-2799/2787.Ways%20to%20Express%20an%20Integer%20as%20Sum%20of%20Powers/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int n = 10;
        int x = 2;

        //--------------------------------------------------------------------------------------------------------------

        final int mod = (int) 1e9 + 7;
        int[][] f = new int[n + 1][n + 1];
        f[0][0] = 1;
        for (int i = 1; i <= n; ++i) {
            long k = (long) Math.pow(i, x);
            for (int j = 0; j <= n; ++j) {
                f[i][j] = f[i - 1][j];
                if (k <= j) {
                    f[i][j] = (f[i][j] + f[i - 1][j - (int) k]) % mod;
                }
            }
        }
        //return f[n][n];

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

