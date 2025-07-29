package leetcode;

import java.io.*;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/2400-2499/2411.Smallest%20Subarrays%20With%20Maximum%20Bitwise%20OR/Solution.java
public class Main {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // Testcase
        int[] nums = {1, 0, 2, 1, 3};

        //--------------------------------------------------------------------------------------------------------------

        int n = nums.length;
        int[] ans = new int[n];
        int[] f = new int[32];
        Arrays.fill(f, -1);
        for (int i = n - 1; i >= 0; --i) {
            int t = 1;
            for (int j = 0; j < 32; ++j) {
                if (((nums[i] >> j) & 1) == 1) {
                    f[j] = i;
                } else if (f[j] != -1) {
                    t = Math.max(t, f[j] - i + 1);
                }
            }
            ans[i] = t;
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

