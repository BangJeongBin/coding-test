package leetcode;

import java.io.*;
import java.util.*;

// 참조 : https://github.com/doocs/leetcode/blob/main/solution/3400-3499/3494.Find%20the%20Minimum%20Amount%20of%20Time%20to%20Brew%20Potions/Solution.java
public class Main {

    public static void solution() throws IOException {

        // Testcase
        int[] skill = {1, 5, 2, 4};
        int[] mana = {5, 1, 4, 2};

        //--------------------------------------------------------------------------------------------------------------

        int n = skill.length;
        long[] f = new long[n];
        for (int x : mana) {
            long tot = 0;
            for (int i = 0; i < n; ++i) {
                tot = Math.max(tot, f[i]) + skill[i] * x;
            }
            f[n - 1] = tot;
            for (int i = n - 2; i >= 0; --i) {
                f[i] = f[i + 1] - skill[i + 1] * x;
            }
        }
        //return f[n - 1];

        //--------------------------------------------------------------------------------------------------------------
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}

