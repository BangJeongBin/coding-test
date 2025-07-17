package leetcode;

import java.io.*;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/3200-3299/3202.Find%20the%20Maximum%20Length%20of%20Valid%20Subsequence%20II/Solution.java
public class Main {

    private int[][] events;
    private int[][] f;
    private int n;

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // Testcase
        int[] nums = {1,2,3,4,5};
        int k = 2;

        //--------------------------------------------------------------------------------------------------------------

        int[][] f = new int[k][k];
        int ans = 0;
        for (int x : nums) {
            x %= k;
            for (int j = 0; j < k; ++j) {
                int y = (j - x + k) % k;
                f[x][y] = f[y][x] + 1;
                ans = Math.max(ans, f[x][y]);
            }
        }
        //return ans;

        //--------------------------------------------------------------------------------------------------------------

        bw.flush();
        bw.close();
        br.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

